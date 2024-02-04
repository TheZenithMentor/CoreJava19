package com.corejava.basics.exceptionhandling;

public class A {
    int a=10;
    // null pointer exception
    public static void main(String[] args) {
        System.out.println("1");
        A obj=null;
        System.out.println(obj.a);
        System.out.println("2");
        System.out.println("3");
    }
}
