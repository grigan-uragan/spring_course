package ru.grigan.spring_course.hibernate_many_to_one_uni;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.grigan.spring_course.hibernate_many_to_one_uni.entity.Department;
import ru.grigan.spring_course.hibernate_many_to_one_uni.entity.Employee;

import java.util.List;


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
//            Department department = new Department("HR", 700, 2500);
//            Employee oleg = new Employee("Oleg", "Petrov", 1500);
//            Employee ivan = new Employee("Ivan", "Ivanov", 600);
//            department.addEmployees(oleg);
//            department.addEmployees(ivan);
//            session.save(department);
//            Department department = session.get(Department.class, 3);
//            List<Employee> list = department.getEmployees();
//            list.forEach(System.out::println);
//
            Department department = session.get(Department.class, 3);
            session.delete(department);
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
