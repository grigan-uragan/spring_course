package ru.grigan.spring_course.aop.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class NewLoggingAspects {

    @Around("execution(public String returnBook())")
    public String aroundReturnBookAdvice(ProceedingJoinPoint proceedingJoinPoint)
            throws Throwable {
        System.out.println("start aroundReturnBookAdvice");
        Object result = null;
        try {
            result = proceedingJoinPoint.proceed();
        } catch (Exception e) {
            System.out.println("aroundReturnBookAdvice: we caught exception - " + e);
            throw e;
        }
        System.out.println("finish aroundReturnBookAdvice");
        return (String) result;
    }
}
