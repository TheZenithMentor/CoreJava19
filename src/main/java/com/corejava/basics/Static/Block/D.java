package com.corejava.basics.Static.Block;

public class D {
    static int a;

    static
    {
        // SIB : Static Initializer Block : When you initialise
        // the static variable from the static block then that static
        // block is called as SIB
        a=10;
        System.out.println(a);
    }
    public static void main(String[] args) {

    }
}
