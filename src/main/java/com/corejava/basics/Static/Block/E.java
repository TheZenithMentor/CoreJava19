package com.corejava.basics.Static.Block;

public class E {
    static int a;

    public static void demo()
    {
        System.out.println("demo()");
    }

    static
    {
        a=10; // initialising the static variable
        System.out.println(E.a);
        int a=5;
        System.out.println(a); // local
        System.out.println(E.a);
    }
    public static void main(String[] args) {
        demo();
    }

    static
    {
        System.out.println("SIB");
    }
}
