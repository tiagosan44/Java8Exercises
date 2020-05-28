package com.myProjects.streamsTerminal;

import com.myProjects.data.Student;
import com.myProjects.data.StudentDataBase;

import static java.util.stream.Collectors.mapping;
import static java.util.stream.Collectors.toList;

public class StreamsMappingExample {


    public static void main(String[] args) {
        StudentDataBase.getAllStudents()
            .stream()
            .collect(mapping(Student::getName, toList()))
            .forEach(System.out::println);;

        StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getName)
                .collect(toList())
                .forEach(System.out::println);
    }
}
