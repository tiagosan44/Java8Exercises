package com.myProjects.streamsTerminal;

import com.myProjects.data.Student;
import com.myProjects.data.StudentDataBase;

import java.awt.*;
import java.util.*;
import java.util.List;
import java.util.function.Predicate;

import static java.util.stream.Collectors.*;

public class StreamGroupingByExample {

    public static void main(String[] args) {
//        groupByGender();
//        groupByCustom();
//        twoLevelGrouping();
//        groupingAndSumming();
//        threeArgumentsGroup();
//        calculateTopGap();
        partitioning();
        partitioning2();
    }

    public static void groupByGender() {
        Map<String, List<Student>> mapByGender = StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(Student::getGender));
        System.out.println(mapByGender);
    }

    public static void groupByCustom() {
        Map<String, List<Student>> mapByCustom = StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(student -> student.getGpa() >= 3.8 ? "OUTSTANDING" : "AVERAGE" ));
        System.out.println(mapByCustom);
    }

    public static void twoLevelGrouping() {
        Map<Integer, Map<String, List<Student>>> twoLevelMap = StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(Student::getGradeLevel
                        , groupingBy(student -> student.getGpa() >= 3.8 ? "OUTSTANDING" : "AVERAGE")));
        System.out.println(twoLevelMap);
    }

    public static void groupingAndSumming() {
        Map<Integer, Integer> groupAndSum = StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(Student::getGradeLevel
                        , summingInt(Student::getNotebooks)));
        System.out.println(groupAndSum);
    }

    public static void threeArgumentsGroup() {
        LinkedHashMap<String, Set<Student>> threeArgument = StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(Student::getName, LinkedHashMap::new, toSet()));
        System.out.println(threeArgument);
    }

    public static void calculateTopGap() {
        Map<Integer, Optional<Student>> topGap = StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(Student::getGradeLevel,
                        maxBy(Comparator.comparing(Student::getGpa))));
        System.out.println(topGap);
    }

    public static void partitioning() {
        Predicate<Student> predicate = student -> student.getGpa() >= 3.8;
        Map<Boolean, List<Student>> gpaPartition = StudentDataBase.getAllStudents()
                .stream()
                .collect(partitioningBy(predicate));
        System.out.println(gpaPartition);
    }

    public static void partitioning2() {
        Predicate<Student> predicate = student -> student.getGpa() >= 3.8;
        Map<Boolean, Set<Student>> partitioning = StudentDataBase.getAllStudents()
                .stream()
                .collect(partitioningBy(predicate, toSet()));
        System.out.println(partitioning);
    }
}
