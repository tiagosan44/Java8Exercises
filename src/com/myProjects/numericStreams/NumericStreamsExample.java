package com.myProjects.numericStreams;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class NumericStreamsExample {

    public static void main(String[] args) {
        System.out.println(IntStream.range(1, 6));
        System.out.println(IntStream.rangeClosed(1, 6));

        //Boxing IntStream to Stream<Integer>
        Stream<Integer> boxed = IntStream.rangeClosed(1, 6).boxed();
        //Unboxing Stream<Integer> to IntStream
        IntStream intStream = boxed.mapToInt(Integer::intValue);
    }


    public static int sumOfNumbersIntStream() {
        return IntStream.rangeClosed(1, 6).sum();
    }
}

