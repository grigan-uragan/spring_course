package ru.grigan.spring_course.intro;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SimpleRun {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext(
                        "applicationContext.xml");
        Person person = context.getBean("myPerson", Person.class);
        person.callYourPet();
        context.close();
    }
}
