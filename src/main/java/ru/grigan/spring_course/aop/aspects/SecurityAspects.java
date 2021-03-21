package ru.grigan.spring_course.aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(10)
public class SecurityAspects {

    @Before("ru.grigan.spring_course.aop.aspects.MyPointcuts.allGetMethod()")
    public void beforeGetSecurityAdvice() {
        System.out.println("beforeGetSecurityAdvice: try to check rules");
    }
}

