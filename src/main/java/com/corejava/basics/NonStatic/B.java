package com.corejava.basics.NonStatic;

public class B {
    int a;

    {
        int a=20;
       // System.out.println(obj.a); obj is not initialised yet
        /* the correct approch is to use "this" keyword*/
        this.a=10;
        System.out.println(this.a);
    }

    public static void main(String[] args) {
        B obj=new B();
    }
}
