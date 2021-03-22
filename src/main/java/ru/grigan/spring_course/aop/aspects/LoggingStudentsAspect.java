package ru.grigan.spring_course.aop.aspects;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
import ru.grigan.spring_course.aop.Student;

import java.util.List;

@Component
@Aspect
public class LoggingStudentsAspect {

    @Before("execution(* getStudents())")
    public void beforeGetStudentsLoggingAdvice() {
        System.out.println("beforeGetStudentsLoggingAdvice:"
                + " logging getStudents method before execution");
    }

    @AfterReturning(pointcut = "execution(* getStudents())",
    returning = "students")
    public void afterGetStudentsReturning(List<Student> students) {
        Student student = students.get(0);
        double avgGrade = student.getAvgGrade();
        student.setAvgGrade(avgGrade + 1);
        System.out.println(student);
        System.out.println("afterGetStudentsReturning: logging getStudents method after execution");
    }
}
