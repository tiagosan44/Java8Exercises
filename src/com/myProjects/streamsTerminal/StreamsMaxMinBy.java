package com.myProjects.streamsTerminal;

import com.myProjects.data.Student;
import com.myProjects.data.StudentDataBase;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

import static java.util.stream.Collectors.maxBy;
import static java.util.stream.Collectors.minBy;

public class StreamsMaxMinBy {

    public static void main(String[] args) {
        List<Student> allStudents = StudentDataBase.getAllStudents();
        System.out.println(minByStudents(allStudents));
        System.out.println(maxByStudents(allStudents));
    }

    public static Optional<Student> minByStudents(List<Student> students) {
        return students.stream()
                .collect(minBy(Comparator.comparing(Student::getGpa)));
    }

    public static Optional<Student> maxByStudents(List<Student> students) {
        return students.stream()
                .collect(maxBy(Comparator.comparing(Student::getGpa)));
    }
}
