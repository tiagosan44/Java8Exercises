package com.myProjects.functionalInterfaces;

import com.myProjects.data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerExample {

    public static void main(String[] args) {
        BiConsumer<String, String> biConsumer = (a, b) -> System.out.println("a: " + a + ", b: " + b);
        biConsumer.accept("java", "8");
        BiConsumer<Integer, Integer> multiplication = (a, b) -> System.out.println("Multiplication is: " + a * b);
        BiConsumer<Integer, Integer> division = (a, b) -> System.out.println("Division is: " + a / b);
        multiplication.andThen(division).accept(10, 2);
        nameAndActivities();
    }

    public static void nameAndActivities() {
        BiConsumer<String, List<String>> biConsumer = (name, activities) -> System.out.println("Name: " + name + ", Activities: " + activities);
        StudentDataBase.getAllStudents()
                .forEach(student -> biConsumer.accept(student.getName(), student.getActivities()));
    }
}
