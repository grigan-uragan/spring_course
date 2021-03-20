package ru.grigan.spring_course.aop;

import org.springframework.stereotype.Component;

@Component
public class SchoolLibrary extends AbstractLibrary{
    @Override
    public void getBook() {
        System.out.println("we will take book from school library");
    }
}
