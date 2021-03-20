package ru.grigan.spring_course.aop;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary {

    public void getBook() {
        System.out.println("We will take from universe");
    }

    public void getMagazine() {
        System.out.println("We will take magazine from universe");
    }
}
