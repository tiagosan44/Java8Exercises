package com.myProjects.optional;

import com.myProjects.data.Student;

import java.util.Arrays;
import java.util.Optional;

public class OptionalPresentExample {

    public static void optionalFilter() {
        Optional<Student> studentOptional = Optional.of(new Student("Jonas", 2, 3.6, "male", Arrays.asList("Travel", "Fix clock "), 13));
        studentOptional.filter( student ->  student.getGpa() >= 4.0).ifPresent(System.out::println);
    }

    public static void optionalMap() {
        Optional<Student> studentOptional = Optional.of(new Student("Jonas", 2, 3.6, "male", Arrays.asList("Travel", "Fix clock "), 13));
        studentOptional.filter( student ->  student.getGpa() >= 4.0).map(Student::getName);
    }

    public static void main(String[] args) {
        optionalFilter();
        optionalMap();
    }
}
