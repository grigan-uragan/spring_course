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

    @Before("getPointcut()")
    public void beforeGetLoggingAdvice() {
        System.out.println("beforeGetLoggingAdvice: try to take book/magazine");
    }

    @Before("getPointcut()")
    public void beforeGetSecurityAdvice() {
        System.out.println("beforeGetSecurityAdvice: check rules");
    }


}
