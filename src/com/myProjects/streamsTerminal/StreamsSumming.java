package com.myProjects.streamsTerminal;

import com.myProjects.data.Student;
import com.myProjects.data.StudentDataBase;

import static java.util.stream.Collectors.averagingInt;
import static java.util.stream.Collectors.summingInt;

public class StreamsSumming {

    public static void main(String[] args) {

    }

    public static int sum() {
        return StudentDataBase.getAllStudents()
                .stream()
                .collect(summingInt(Student::getNotebooks));
    }

    public static double avg() {
        return StudentDataBase.getAllStudents()
                .stream()
                .collect(averagingInt(Student::getNotebooks));
    }
}
