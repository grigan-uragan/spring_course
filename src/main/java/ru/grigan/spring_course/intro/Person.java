package ru.grigan.spring_course.intro;

import org.springframework.beans.factory.annotation.Value;

public class Person {
    private Pet pet;
    @Value("${person.name}")
    private String name;
    @Value(("${person.age}"))
    private int age;

    public Person(Pet pet) {
        this.pet = pet;
        System.out.println("person bean is created");
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void callYourPet() {
        System.out.println("Hello my lovely pet!");
        pet.say();
    }

    public void setPet(Pet pet) {
        System.out.println("Class Person: set pet");
        this.pet = pet;
    }
}
