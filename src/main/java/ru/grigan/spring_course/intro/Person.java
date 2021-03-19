package ru.grigan.spring_course.intro;

public class Person {
    private Pet pet;

    public Person() {
        System.out.println("person bean is created");
    }

    public void callYourPet() {
        System.out.println("Hello my lovely pet!");
        pet.say();
    }

    public void setPet(Pet pet) {
        System.out.println("injection pet by setter");
        this.pet = pet;
    }
}
