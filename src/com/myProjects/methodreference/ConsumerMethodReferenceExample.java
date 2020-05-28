package com.myProjects.methodreference;

import com.myProjects.data.Student;
import com.myProjects.data.StudentDataBase;

import java.util.function.Consumer;

public class ConsumerMethodReferenceExample {

    static Consumer<Student> consumer = s -> System.out.println(s);
    static Consumer<Student> methodReference = System.out::println;

    public static void main(String[] args) {
        StudentDataBase.getAllStudents().forEach(consumer);
        StudentDataBase.getAllStudents().forEach(methodReference);
    }
}
