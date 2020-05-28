package com.myProjects.streamsTerminal;

import com.myProjects.data.Student;
import com.myProjects.data.StudentDataBase;

import java.util.List;

import static java.util.stream.Collectors.counting;

public class StreamsCountingExample {

    public static void main(String[] args) {
        System.out.println(count(StudentDataBase.getAllStudents()));
    }

    public static long count(List<Student> studentList) {
        return studentList
                .stream()
                .filter(student -> student.getGpa() >= 3.9)
                .collect(counting());
    }
}
