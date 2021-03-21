package ru.grigan.spring_course.aop.aspects;

import org.aspectj.lang.annotation.Pointcut;

public class MyPointcuts {

    @Pointcut("execution(* get*())")
    public void allGetMethod(){}

    @Pointcut("execution(* * (..))")
    public void allMethodLogging(){}

    @Pointcut("execution(public void returnMagazine())")
    public void onlyReturnMagazineMethodLogging(){}

//    @Pointcut("allMethodLogging() && !onlyReturnMagazineMethodLogging()")
//    public void allMethodWithoutReturnMagazine(){}
}
