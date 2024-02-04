package com.corejava.basics.wrapperclasses;

public class A {
    public static void main(String[] args) {
        // pdt to object type
        int a=10;
        Integer obj=a;
        System.out.println(a);
        System.out.println(obj);

        int b=20;
        Integer obj1= Integer.valueOf(b);
        System.out.println(b);
        System.out.println(obj1);



    }
}
/*
*   assignment : try to check boxing and autoboxing for the remaining primitive data types
*
* */