package com.myProjects.streams;

import java.util.Random;
import java.util.stream.Stream;

public class StreamFactoryMethods {

    public static void main(String[] args) {
        Stream.of("Adam", "Jonas", "Martha").forEach(System.out::println);
        Stream.iterate(1, x -> x * 2).limit(20).forEach(System.out::println);
        Stream.generate(() -> new Random().nextInt()).limit(20).forEach(System.out::println);

    }
}
