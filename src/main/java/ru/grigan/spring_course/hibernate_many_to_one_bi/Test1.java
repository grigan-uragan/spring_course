package ru.grigan.spring_course.hibernate_many_to_one_bi;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.grigan.spring_course.hibernate_many_to_one_bi.entity.Department;
import ru.grigan.spring_course.hibernate_many_to_one_bi.entity.Employee;


public class Test1 {
    private static final Logger LOG = LoggerFactory.getLogger(Test1.class);

    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Department.class)
                .buildSessionFactory();
        Session session = null;
        try {
            session = factory.getCurrentSession();
            session.beginTransaction();
//            Department department = new Department("IT", 500, 1500);
//            Employee grigan = new Employee("Grigan", "Uragan", 500);
//            Employee gurgen = new Employee("Gurgen", "Purgen", 500);
//            department.addEmployees(grigan);
//            department.addEmployees(gurgen);
//            session.save(department);
//            Department department = session.get(Department.class, 1);
//            List<Employee> list = department.getEmployees();
//            list.forEach(System.out::println);
            Employee employee = session.get(Employee.class, 2);
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
