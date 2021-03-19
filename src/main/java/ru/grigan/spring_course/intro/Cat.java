package ru.grigan.spring_course.intro;

import org.springframework.stereotype.Component;

@Component("catBean") // создастся bean с id catBean
public class Cat implements Pet {

    public Cat() {
        System.out.println("Class Cat created");
    }

    @Override
    public void say() {
        System.out.println("Meow - Meow");
    }
}
