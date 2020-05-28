package com.myProjects.lambdas;

public class RunnableLambdaExample {

    public static void main(String[] args) {

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Inside runnable");
            }
        };
        new Thread(runnable).start();

        Runnable runnable1 = () -> System.out.println("Inside lambda");

        new Thread(runnable1).start();
    }
}
