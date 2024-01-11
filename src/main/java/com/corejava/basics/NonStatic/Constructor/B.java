package com.corejava.basics.NonStatic.Constructor;

public class B {
    int a; // ns variable
    public static void main(String[] args) {
        B ref=new B();
        System.out.println(ref.a);
    }
}
