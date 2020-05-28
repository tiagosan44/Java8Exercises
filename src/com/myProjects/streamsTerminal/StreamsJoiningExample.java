package com.myProjects.streamsTerminal;

import com.myProjects.data.Student;
import com.myProjects.data.StudentDataBase;

import java.util.List;

import static java.util.stream.Collectors.joining;

public class StreamsJoiningExample {

    public static void main(String[] args) {
        System.out.println(joiningNames(StudentDataBase.getAllStudents()));
        System.out.println(delimiterJoining(StudentDataBase.getAllStudents()));
        System.out.println(delimiterJoiningParenthesis(StudentDataBase.getAllStudents()));
    }

    public static String joiningNames(List<Student> studentList) {
        return studentList
                .stream()
                .map(Student::getName)
                .collect(joining());
    }

    public static String delimiterJoining(List<Student> studentList) {
        return studentList
                .stream()
                .map(Student::getName)
                .collect(joining("-"));
    }

    public static String delimiterJoiningParenthesis(List<Student> studentList) {
        return studentList
                .stream()
                .map(Student::getName)
                .collect(joining("-", "(", ")"));
    }
}
