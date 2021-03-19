package ru.grigan.spring_course.intro;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext2.xml");
        Pet cat = context.getBean("catBean", Pet.class);
        BCat bCat = context.getBean("BCat", BCat.class);
        Person person = context.getBean("person", Person.class);
        context.close();
    }
}
