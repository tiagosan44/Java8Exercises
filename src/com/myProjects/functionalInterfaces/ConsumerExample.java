package com.myProjects.functionalInterfaces;

import com.myProjects.data.Student;
import com.myProjects.data.StudentDataBase;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {

    static Consumer<Student> consumerName = s -> System.out.println(s.getName());
    static Consumer<Student> consumerActivities = s -> System.out.println(s.getActivities());

    public static void main(String[] args) {

        Consumer<String> c1 = (s) -> System.out.println(s.toUpperCase());
        c1.andThen(s -> System.out.println(s.toLowerCase())).accept("java8");;
        printName();
        printNameAndActivities();
    }

    public static void printName() {
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach(consumerName);
    }

    public static void printNameAndActivities() {
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach(consumerName.andThen(consumerActivities));
    }
}
