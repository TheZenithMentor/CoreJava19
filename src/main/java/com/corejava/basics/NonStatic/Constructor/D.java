package com.corejava.basics.NonStatic.Constructor;

public class D {
    {
        System.out.println("Ns Block");
    }

    // constructor
    D()
    {

        System.out.println("constructor of the class");
    }

    public static void main(String[] args) {
        D obj=new D();
    }
}
