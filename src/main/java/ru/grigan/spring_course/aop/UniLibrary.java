package ru.grigan.spring_course.aop;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary {

    public void getBook() {
        System.out.println("We will take the book from universe");
    }

    public void getMagazine() {
        System.out.println("We will take the magazine from universe");
    }

    public void addBook(String owner, Book book) {
        System.out.println("We will add the book in universe");
    }

    public void addMagazine() {
        System.out.println("We will add the magazine in universe");
    }

    public void returnBook() {
        System.out.println("We will return the book in universe");
    }

    public void returnMagazine() {
        System.out.println("We will add the book in universe");
    }
}
