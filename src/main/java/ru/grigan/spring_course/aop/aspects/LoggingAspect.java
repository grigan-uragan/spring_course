package ru.grigan.spring_course.aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

    @Before("execution(* get*(..))")
    public void beforeGetBookAdvice() {
        System.out.println("beforeGetBookAdvice: try to take book");
    }

    @Before("execution(public void returnBook(ru.grigan.spring_course.aop.Book))")
    public void beforeReturnBookAdvice() {
        System.out.println("beforeReturnBookAdvice: try to return book");
    }
}