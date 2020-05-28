package com.myProjects.functionalInterfaces;

import com.myProjects.data.Student;
import com.myProjects.data.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class BiFunctionExample {

    static BiFunction<List<Student>, Predicate<Student>, Map<String, Double>> studentGpaMap = (students, studentPredicate) ->
            students.stream()
                .filter(studentPredicate)
                .collect(Collectors.toMap(Student::getName, Student::getGpa));

    public static void main(String[] args) {
        System.out.println(studentGpaMap.apply(StudentDataBase.getAllStudents(), student -> student.getGpa() > 3.5));
    }
}
