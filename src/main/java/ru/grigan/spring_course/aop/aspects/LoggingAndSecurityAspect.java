package ru.grigan.spring_course.aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAndSecurityAspect {

    @Pointcut("execution(* get*())")
    public void getPointcut(){}

    @Pointcut("execution(* * (..))")
    public void allMethodLogging(){}

    @Pointcut("execution(public void returnMagazine())")
    public void onlyReturnMagazineMethodLogging(){}

    @Pointcut("allMethodLogging() && !onlyReturnMagazineMethodLogging()")
    public void allMethodWithoutReturnMagazine(){}

    @Before("allMethodWithoutReturnMagazine()")
    public void beforeAllMethodWithoutReturnMagazine() {
        System.out.println("beforeAllMethodWithoutReturnMagazine: LOG#1");
    }
}
