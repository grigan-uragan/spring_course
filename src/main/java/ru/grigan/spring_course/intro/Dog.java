package ru.grigan.spring_course.intro;

public class Dog implements Pet {
    @Override
    public void say() {
        System.out.println("wow wow");
    }
}
