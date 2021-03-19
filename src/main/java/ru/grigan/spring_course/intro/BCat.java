package ru.grigan.spring_course.intro;

import org.springframework.stereotype.Component;

// по умолчанию, если имя класса начинается с 2-х заглавных букв подряд то
// id бина будет как и название класса!
@Component
public class BCat implements Pet {

    public BCat() {
        System.out.println("Class BCat created");
    }

    @Override
    public void say() {
        System.out.println("Meow блееааать");
    }
}
