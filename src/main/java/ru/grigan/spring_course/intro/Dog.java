package ru.grigan.spring_course.intro;

public class Dog implements Pet {

    public Dog() {
        System.out.println("dog been is created");
    }

    @Override
    public void say() {
        System.out.println("wow wow");
    }
}
