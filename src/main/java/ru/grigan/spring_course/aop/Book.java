package ru.grigan.spring_course.aop;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Book {
    @Value("War and peace")
    private String title;
    @Value("Leo Tolstoy")
    private String author;
    @Value("1869")
    private String yearsRelease;

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getYearsRelease() {
        return yearsRelease;
    }

    @Override
    public String toString() {
        return "Book{" + "title='"
                + title + '\'' + ", author='"
                + author + '\'' + ", yearsRelease='"
                + yearsRelease + '\'' + '}';
    }
}
