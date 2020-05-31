package com.myProjects.defaults;

public class Client implements Interface1, Interface2, Interface3, Interface4{

    public static void main(String[] args) {
        Client client = new Client();

        client.methodA();
        client.methodB();
        client.methodC();
    }

    public void  methodA() {
        System.out.println("Inside method A" + Client.class);
    }
}
