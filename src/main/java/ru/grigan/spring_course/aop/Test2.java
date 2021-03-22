package ru.grigan.spring_course.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);
        University university = context.getBean("university", University.class);
        university.addStudents(new Student("Grigan", 1, 3.5));
        university.addStudents(new Student("Uragan", 2, 3.8));
        university.addStudents(new Student("Obrugan", 3, 4.5));
        List<Student> students = university.getStudents();
        System.out.println(students);
        context.close();
    }
}
