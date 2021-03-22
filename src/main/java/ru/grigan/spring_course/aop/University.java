package ru.grigan.spring_course.aop;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class University {
    private List<Student> students = new ArrayList<>();

    public void addStudents(Student student) {
        students.add(student);
    }

    public List<Student> getStudents() {
        System.out.println(students);
        return students;
    }
}
