package com.myProjects.functionalInterfaces;

import com.myProjects.data.Student;
import com.myProjects.data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PredicateAndConsumerExample {

    public static Predicate<Student> filterByGrade = s -> s.getGradeLevel() > 3;
    public static Predicate<Student> filterByGpa = s -> s.getGpa() > 3.5;
    public static BiConsumer<String, List<String>> biConsumer = (name, activities) -> System.out.println("Name: " + name + ", Activities: " + activities);
    public static Consumer<Student> studentConsumer = student -> {
        if(filterByGrade.and(filterByGpa).test(student))
            biConsumer.accept(student.getName(), student.getActivities());
    };

    public static void main(String[] args) {
        StudentDataBase.getAllStudents().forEach(studentConsumer);
    }
}
