package ru.grigan.spring_course.hibernate.one_to_one;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.grigan.spring_course.hibernate.one_to_one.entity.Detail;
import ru.grigan.spring_course.hibernate.one_to_one.entity.Employee;

public class Test2 {
    private static final Logger LOG = LoggerFactory.getLogger(Test1.class);

    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();
        Session session = null;
        try {
            session = factory.getCurrentSession();
            session.beginTransaction();
//            Detail detail = new Detail("Minsk", "12333", "misha@mail.ru");
//            Employee employee = new Employee("Misha", "Petrov", "Sale", 400);
//            detail.setEmployee(employee);
//            employee.setEmpDetail(detail);
//            session.save(detail);
//            Detail detail = session.get(Detail.class, 4);
//            System.out.println(detail.getEmployee());
            Detail detail = session.get(Detail.class, 4);
            detail.getEmployee().setEmpDetail(null);
            session.delete(detail);
            session.getTransaction().commit();
            session.close();
        } catch (Exception e) {
            LOG.error("transaction exception", e);
            factory.getCurrentSession().getTransaction().rollback();
            throw e;
        } finally {
            if (session != null) {
                session.close();
            }
            factory.close();
        }
    }
}
