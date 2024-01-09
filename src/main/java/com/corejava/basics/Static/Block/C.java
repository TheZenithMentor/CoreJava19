package com.corejava.basics.Static.Block;

public class C {
    static int a;

    static
    {
        int a=10;
        System.out.println("Static block executed");
        a=20;
        System.out.println(a);
        System.out.println(C.a);
    }

    public static void main(String[] args) {
        System.out.println(C.a);
    }

}
