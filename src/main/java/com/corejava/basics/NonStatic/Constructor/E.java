package com.corejava.basics.NonStatic.Constructor;

public class E {

    // arguments or parameterised constructor
    E(int a)
    {
        System.out.println("constructor(int)");
    }

    public static void main(String[] args) {
        E obj=new E(10);
    }
}
