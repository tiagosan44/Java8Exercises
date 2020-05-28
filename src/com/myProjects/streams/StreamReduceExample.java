package com.myProjects.streams;

import com.myProjects.data.Student;
import com.myProjects.data.StudentDataBase;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StreamReduceExample {

    public static void main(String[] args) {

        List<Integer> integers = Arrays.asList(1,2,4,6,8);
        System.out.println(multiplication(integers));

        Student student = StudentDataBase.getAllStudents()
                .stream()
                .max(Comparator.comparing(Student::getGpa))
                .orElseGet(Student::new);

        System.out.println(student);

    }

    public static int multiplication(List<Integer> integers) {
        return integers.stream()
                .reduce(1, (i, i2) -> i * i2);
    }
}
