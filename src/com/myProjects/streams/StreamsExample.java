package com.myProjects.streams;

import com.myProjects.data.Student;
import com.myProjects.data.StudentDataBase;

import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamsExample {

    public static Predicate<Student> filterByGrade = s -> s.getGradeLevel() > 3;
    public static Predicate<Student> filterByGpa = s -> s.getGpa() > 3.5;

    public static void main(String[] args) {

        StudentDataBase.getAllStudents()
                .stream()
                .filter(filterByGrade.and(filterByGpa))
                .collect(Collectors.toMap(Student::getName, Student::getActivities))
                .forEach((name, activities) -> System.out.println("Student: " + name + " , activities: " + activities));
    }
}
