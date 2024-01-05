package com.corejava.basics.Static.Variable;

public class C {

    static int a=10;
    static int b=20;

    public static void main(String[] args) {
        int a=25;
        a--;
        System.out.println(a);
        System.out.println(C.a);
        a=5;
        System.out.println(a);
        C.b=15;
        System.out.println(b);
        System.out.println(C.b);
    }
}
