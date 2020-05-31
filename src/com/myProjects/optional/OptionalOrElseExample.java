package com.myProjects.optional;

import com.myProjects.data.Student;

import java.util.Optional;

public class OptionalOrElseExample {

    public static String optionalOrElse() {
        Optional<Student> studentOptional = Optional.empty();
        return studentOptional.map(Student::getName).orElse("Default");
    }

    public static String optionalOrElseGet() {
        Optional<Student> studentOptional = Optional.empty();
        return studentOptional.map(Student::getName).orElseGet(() -> "Default get");
    }

    public static String optionalOrElseThrow() {
        Optional<Student> studentOptional = Optional.empty();
        return studentOptional.map(Student::getName).orElseThrow(RuntimeException::new);
    }

    public static void main(String[] args) {
        System.out.println(optionalOrElse());
        System.out.println(optionalOrElseGet());
        System.out.println(optionalOrElseThrow());
    }
}
