package com.corejava.basics.Method;

public class A {

    //create own method

    public static void welcome()
    {
        System.out.println("welcome method");
    }
    public static void main(String[] args) {
        System.out.println("main method");
        welcome();
        System.out.println("end");
    }
}
