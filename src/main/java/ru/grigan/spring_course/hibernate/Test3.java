package ru.grigan.spring_course.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.grigan.spring_course.hibernate.entity.Employee;

import java.util.List;

public class Test3 {
    private static final Logger LOG = LoggerFactory.getLogger(Test2.class);
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        try {
            Session session = factory.getCurrentSession();
            session.beginTransaction();
            Employee grigan = session.get(Employee.class, 1);
            grigan.setSalary(1500);
            session.getTransaction().commit();
            session.close();
            session = factory.getCurrentSession();
            session.beginTransaction();
            List list = session.createQuery("from Employee order by id").getResultList();
            session.getTransaction().commit();
            session.close();
            list.forEach(System.out::println);
        } catch (Exception e) {
            LOG.error("transaction exception", e);
            factory.getCurrentSession().getTransaction().rollback();
            throw e;
        } finally {
            factory.close();
        }
    }
}
