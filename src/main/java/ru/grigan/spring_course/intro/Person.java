package ru.grigan.spring_course.intro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component // по умолчанию создастся bean с id 'person'
public class Person {

    private Pet pet;

    private String name;

    private int age;

    public Person() {
        System.out.println("person bean is created");
    }

    @Autowired
    public Person(@Qualifier("BCat") Pet pet) {
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
