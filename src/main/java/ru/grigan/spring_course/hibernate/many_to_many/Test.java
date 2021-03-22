package ru.grigan.spring_course.hibernate.many_to_many;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.grigan.spring_course.hibernate.many_to_many.entity.Children;
import ru.grigan.spring_course.hibernate.many_to_many.entity.Section;

public class Test {
    private static final Logger LOG = LoggerFactory.getLogger(Test.class);

    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Children.class)
                .addAnnotatedClass(Section.class)
                .buildSessionFactory();
        Session session = null;
        try {
            session = factory.getCurrentSession();
//            Section section = new Section("football");
//            Children one = new Children("Misha", 8);
//            Children two = new Children("Masha", 9);
//            Children three = new Children("Grisha", 10);
//            section.addChildren(one);
//            section.addChildren(two);
//            section.addChildren(three);
//            session.beginTransaction();
//            session.save(section);
//            ==============================================================
//            Children petya = new Children("Petya", 7);
//            Section chess = new Section("Chess");
//            Section hockey = new Section("Hockey");
//            Section box = new Section("Box");
//            petya.addSection(chess);
//            petya.addSection(hockey);
//            petya.addSection(box);
//            session.beginTransaction();
//            session.save(petya);
            //=====================================================
//            session.beginTransaction();
//            Children children = session.get(Children.class, 4);
//            System.out.println(children);
//            System.out.println(children.getSectionList());
            //======================================================
            session.beginTransaction();
            Section section = session.get(Section.class, 1);
            System.out.println(section);
            System.out.println(section.getChildrenList());
            session.getTransaction().commit();
            System.out.println("Done!!!");
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
