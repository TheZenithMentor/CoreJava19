package com.corejava.basics.Static.Method;

public class A {
    public static void demo()
    {
        System.out.println("demo() method");
    }
    public static void main(String[] args) {
        //  1st way
        demo();
        // 2nd way : class name as reference
        A.demo();

    }
}
