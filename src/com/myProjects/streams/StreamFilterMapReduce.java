package com.myProjects.streams;

import com.myProjects.data.Student;
import com.myProjects.data.StudentDataBase;

public class StreamFilterMapReduce {

    public static void main(String[] args) {
        System.out.println(getMaxGpa());
        System.out.println(getMinGpa());
    }

    public static Double getMaxGpa() {
        return StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getGpa)
                .reduce(0.0, (a, b) -> a > b ? a : b);
    }

    public static Double getMinGpa() {
        return StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getGpa)
                .reduce(9999.9,(a, b) -> a < b ? a : b);
    }
}
