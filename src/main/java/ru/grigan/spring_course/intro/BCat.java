package ru.grigan.spring_course.intro;

public class BCat implements Pet {

    public BCat() {
        System.out.println("Class BCat created");
    }

    @Override
    public void say() {
        System.out.println("Meow блееааать");
    }
}
