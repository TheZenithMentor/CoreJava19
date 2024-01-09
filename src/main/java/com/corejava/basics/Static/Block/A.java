package com.corejava.basics.Static.Block;

public class A {
    // static block executed before the execution of main method begins

    public static void main(String[] args) {
        System.out.println("main method");
    }
    static
    {
        System.out.println("Static block");
    }
}
