package com.myProjects.parallelStream;

import java.util.stream.IntStream;

public class parallelStreamExample {

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        sumSequentStream();
        long endTime = System.currentTimeMillis();
        System.out.println("Sequence time is: " + (endTime - startTime));
        startTime = System.currentTimeMillis();
        sumParallelStream();
        endTime = System.currentTimeMillis();
        System.out.println("Parallel time is: " + (endTime - startTime));

        System.out.println(Runtime.getRuntime().availableProcessors());
    }

    public static int sumSequentStream() {
        return IntStream.rangeClosed(1, 100000)
                .sum();
    }

    public static int sumParallelStream() {
        return IntStream.rangeClosed(1, 100000)
                .parallel()
                .sum();
    }

}
