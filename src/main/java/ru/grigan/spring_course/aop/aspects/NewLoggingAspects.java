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
        long start = System.currentTimeMillis();
        Object result = proceedingJoinPoint.proceed();
        long finish = System.currentTimeMillis();
        System.out.println("method returnBook work at " + (finish - start) + "ms");
        System.out.println("finish aroundReturnBookAdvice");
        return (String) result;
    }
}
