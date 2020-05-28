package com.myProjects.functionalInterfaces;

import com.myProjects.data.Student;
import com.myProjects.data.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionExample {

    static Function<String, String> function = String::toUpperCase;
    static Function<String, String> addSomething = s -> s.concat("Default");
    static Function<List<Student>, Map<String, Double>> studentGpaMap = students -> students.stream()
            .collect(Collectors.toMap(Student::getName, Student::getGpa));

    public static void main(String[] args) {
        System.out.println(function.apply("Test"));
        System.out.println(function.andThen(addSomething).apply("Test"));
        System.out.println(function.compose(addSomething).apply("Test"));

        System.out.println(studentGpaMap.apply(StudentDataBase.getAllStudents()));
    }
}
