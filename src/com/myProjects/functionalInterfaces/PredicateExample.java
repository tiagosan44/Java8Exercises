package com.myProjects.functionalInterfaces;

import com.myProjects.data.Student;
import com.myProjects.data.StudentDataBase;

import java.util.function.Predicate;

public class PredicateExample {

    public static Predicate<Integer> predicate = i -> i % 2 == 0;
    public static Predicate<Integer> predicate1 = i -> i % 2 != 0;
    public static Predicate<Student> filterByGrade = s -> s.getGradeLevel() > 3;
    public static Predicate<Student> filterByGpa = s -> s.getGpa() > 3.5;

    public static void main(String[] args) {
        System.out.println(predicate.test(4));
        System.out.println(predicate.and(predicate1).test(10));
        System.out.println(predicate.or(predicate1).test(10));

        StudentDataBase.getAllStudents()
                .stream()
                .filter(filterByGrade)
                .forEach(System.out::println);

        StudentDataBase.getAllStudents()
                .stream()
                .filter(filterByGrade.and(filterByGpa))
                .forEach(System.out::println);
    }
}
