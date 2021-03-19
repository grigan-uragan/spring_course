package ru.grigan.spring_course.intro;

public class Cat implements Pet {

    public Cat() {
        System.out.println("Class Cat created");
    }

    @Override
    public void say() {
        System.out.println("Meow - Meow");
    }
}
