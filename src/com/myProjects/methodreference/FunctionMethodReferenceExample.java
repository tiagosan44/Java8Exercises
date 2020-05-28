package com.myProjects.methodreference;

import java.util.function.Function;

public class FunctionMethodReferenceExample {

    static Function<String, String> function = s -> s.toUpperCase();
    static Function<String, String> methodReference = String::toUpperCase;

    public static void main(String[] args) {
        System.out.println(function.apply("Function"));
        System.out.println(methodReference.apply("Method reference"));
    }
}
