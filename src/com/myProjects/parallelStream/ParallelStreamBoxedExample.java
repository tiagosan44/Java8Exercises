package com.myProjects.parallelStream;

import java.util.List;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

public class ParallelStreamBoxedExample {

    public static void main(String[] args) {
        List<Integer> integerList = IntStream.rangeClosed(1, 10000)
                .boxed()
                .collect(toList());
        sequentialSum(integerList);
        parallelSum(integerList);
    }

    public static int sequentialSum(List<Integer> integerList) {
        long start = System.currentTimeMillis();
        int sum = integerList
                .stream()
                .reduce(0, (x ,y) -> x + y);
        long duration = System.currentTimeMillis() - start;
        System.out.println("Sequential: " + duration);
        return sum;
    }

    public static int parallelSum(List<Integer> integerList) {
        long start = System.currentTimeMillis();
        int sum = integerList
                .parallelStream()
                .reduce(0, (x ,y) -> x + y);
        long duration = System.currentTimeMillis() - start;
        System.out.println("Parallel: " + duration);
        return sum;
    }
}
