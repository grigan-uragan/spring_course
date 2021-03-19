package ru.grigan.spring_course.intro;

public class Person {
    private Pet pet;

    public Person(Pet pet) {
        System.out.println("person bean is created");
        this.pet = pet;
    }

    public void callYourPet() {
        System.out.println("Hello my lovely pet!");
        pet.say();
    }
}
