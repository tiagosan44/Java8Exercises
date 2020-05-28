package com.myProjects.streams;

import com.myProjects.data.StudentDataBase;

public class StreamsMatchExample {



    public static void main(String[] args) {
        System.out.println(StudentDataBase.getAllStudents()
                .stream()
                .allMatch(student -> student.getGpa() >= 3.9));
        System.out.println(StudentDataBase.getAllStudents()
                .stream()
                .anyMatch(student -> student.getGpa() >= 3.9));
        System.out.println(StudentDataBase.getAllStudents()
                .stream()
                .noneMatch(student -> student.getGpa() >= 3.9));
    }
}
