package com.corejava.basics.NonStatic.NSBlock;

public class A {
    int a;

    // non static block
    {
        System.out.println("NS block");
    }

    public static void main(String[] args) {
       A obj=new A();
        System.out.println(obj.a);
    }

    {
        System.out.println("NS block -2 ");
    }
}
