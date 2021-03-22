package ru.grigan.spring_course.hibernate.one_to_one;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.grigan.spring_course.hibernate.one_to_one.entity.Detail;
import ru.grigan.spring_course.hibernate.one_to_one.entity.Employee;

public class Test1 {
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
//            Employee employee = session.get(Employee.class, 1);
//            System.out.println(employee.getEmpDetail());
            Employee employee = session.get(Employee.class, 2);
            System.out.println(employee);
            session.delete(employee);
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
