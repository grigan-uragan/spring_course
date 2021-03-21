package ru.grigan.spring_course.aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(30)
public class ExceptionHandlingAspects {

    @Before("ru.grigan.spring_course.aop.aspects.MyPointcuts.allGetMethod()")
    public void beforeGetExceptionHandlingAdvice() {
        System.out.println("beforeGetExceptionHandlingAdvice: "
                + "catch or handling exception when we try to get book or magazine");
    }

}
