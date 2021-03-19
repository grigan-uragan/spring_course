package ru.grigan.spring_course.intro;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext2.xml"
        );
        Person person = context.getBean("person", Person.class);
        person.callYourPet();
        System.out.println(person.getName());
        System.out.println(person.getAge());
        context.close();
    }
}
