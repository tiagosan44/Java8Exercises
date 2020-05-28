package com.myProjects.streams;

import com.myProjects.data.Student;
import com.myProjects.data.StudentDataBase;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamsMapExample {

    public static void main(String[] args) {
        System.out.println(nameList());
        System.out.println(nameSet());
    }

    public static List<String> nameList(){
        return StudentDataBase.getAllStudents().stream()
                .map(Student::getName)
                .collect(Collectors.toList());
    }

    public static Set<String> nameSet(){
        return StudentDataBase.getAllStudents().stream()
                .map(Student::getName)
                .map(String::toUpperCase)
                .collect(Collectors.toSet());
    }
}
