package com.myProjects.defaults;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DefaultMethodsExample {

    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("Mikel", "Adam", "Martha", "Ulrich");
        Collections.sort(stringList);
        System.out.println("Sorted list using Collections.sort()");
    }
}
