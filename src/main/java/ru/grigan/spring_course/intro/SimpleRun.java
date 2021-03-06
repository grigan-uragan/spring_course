package ru.grigan.spring_course.intro;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SimpleRun {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext(
                        "applicationContext1.xml");
        Person person = context.getBean("myPerson", Person.class);
        person.callYourPet();
        System.out.println(person.getName());
        System.out.println(person.getAge());
        context.close();
    }
}
