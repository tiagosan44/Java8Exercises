package com.myProjects.optional;

import java.util.Optional;

public class OptionalMapExample {

    public static void main(String[] args) {
        Optional<String> optional = Optional.ofNullable(null);

        String s1 = optional.orElse("sdfgsdfdsfsd");
        System.out.println(s1);
    }
}
