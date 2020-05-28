package com.myProjects.functionalInterfaces;

import com.myProjects.data.Student;

import java.util.Arrays;
import java.util.function.Supplier;

public class SupplierExample {

    public static void main(String[] args) {
        Supplier<Student> studentSupplier = () -> new Student("Jonas", 2, 3.6, "male", Arrays.asList("Travel", "Fix clock "), 13);

        System.out.println("Student is: " + studentSupplier.get());
    }
}
