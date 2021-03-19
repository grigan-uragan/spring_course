package ru.grigan.spring_course.intro;

public class Dog implements Pet {

    public Dog() {
        System.out.println("dog been is created");
    }

    @Override
    public void say() {
        System.out.println("wow wow");
    }

    public void init() {
        System.out.println("Class Dog: init method");
    }

    public void destroy() {
        System.out.println("Class Dog: destroy method");
    }
}
