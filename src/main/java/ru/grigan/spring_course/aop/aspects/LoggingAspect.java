package ru.grigan.spring_course.aop.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import ru.grigan.spring_course.aop.Book;

@Component
@Aspect
@Order(-20)
public class LoggingAspect {

//    @Before("allMethodWithoutReturnMagazine()")
//    public void beforeAllMethodWithoutReturnMagazine() {
//        System.out.println("beforeAllMethodWithoutReturnMagazine: LOG#1");
//    }

//    @Before("ru.grigan.spring_course.aop.aspects.MyPointcuts.allGetMethod()")
//    public void beforeGetLoggingAdvice() {
//        System.out.println("beforeGetLoggingAdvice: try to get book or magazine");
//        System.out.println("------------------------------------------------------");
//    }

//    @Before("ru.grigan.spring_course.aop.aspects.MyPointcuts.allAddMethod()")
//    public void beforeAddLoggingAdvice(JoinPoint joinPoint) {
//        System.out.println("beforeAddLoggingAdvice: present info about method");
//        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
//        System.out.println("declaring type name: " + signature.getDeclaringTypeName());
//        System.out.println("return type" + signature.getReturnType());
//        System.out.println("method: " + signature.getMethod());
//        Object[] arguments = joinPoint.getArgs();
//        for (Object obj : arguments) {
//            if (obj instanceof Book) {
//                Book book = (Book) obj;
//                System.out.println("Title " + book.getTitle());
//                System.out.println("Author " + book.getAuthor());
//                System.out.println("Year of release " + book.getYearsRelease());
//            } else if (obj instanceof String) {
//                System.out.println("Book owner " + obj);
//            }
//        }
//    }
}
