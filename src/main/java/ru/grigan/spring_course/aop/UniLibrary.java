package ru.grigan.spring_course.aop;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary{

    @Override
    public void getBook() {
        System.out.println("We will take book from universe");
    }

    public void getMagazine() {
        System.out.println("We will take magazine from universe");
    }

    public void returnBook() {
        System.out.println("we will return book to universe");
    }
}
