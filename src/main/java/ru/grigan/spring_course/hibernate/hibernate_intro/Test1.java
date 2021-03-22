package ru.grigan.spring_course.hibernate.hibernate_intro;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.grigan.spring_course.hibernate.hibernate_intro.entity.Employee;

public class Test1 {
    private static final Logger LOG = LoggerFactory.getLogger(Test1.class);
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();
        try {
            Session session = factory.getCurrentSession();
            Employee employee = new Employee("Gigan", "Uragan", "IT", 1000);
            session.beginTransaction();
            session.save(employee);
            session.getTransaction().commit();
            session.close();
        } catch (Exception e) {
            factory.getCurrentSession().getTransaction().rollback();
            LOG.error("hibernate exception ", e);
            e.printStackTrace();
            throw e;
        } finally {
            factory.close();
        }
    }
}
