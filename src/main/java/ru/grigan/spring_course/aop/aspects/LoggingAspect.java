package ru.grigan.spring_course.aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(-20)
public class LoggingAspect {

//    @Before("allMethodWithoutReturnMagazine()")
//    public void beforeAllMethodWithoutReturnMagazine() {
//        System.out.println("beforeAllMethodWithoutReturnMagazine: LOG#1");
//    }

    @Before("ru.grigan.spring_course.aop.aspects.MyPointcuts.allGetMethod()")
    public void beforeGetLoggingAdvice() {
        System.out.println("beforeGetLoggingAdvice: try to get book or magazine");
    }
}
