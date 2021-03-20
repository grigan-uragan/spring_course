package ru.grigan.spring_course.aop;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Book {
    @Value("War and peace")
    private String title;

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Book{" + "title='" + title + '\'' + '}';
    }
}
