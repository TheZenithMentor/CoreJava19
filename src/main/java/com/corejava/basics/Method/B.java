package com.corejava.basics.Method;

public class B {

    public static void demo()
    {
        demo1(); //method call statement
        System.out.println("demo method");
    }

    public static void demo1()
    {
        System.out.println("demo1 method");
    }
    public static void main(String[] args) {
        demo();

    }
}

// we can call any  method from any other method