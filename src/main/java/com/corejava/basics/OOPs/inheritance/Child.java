package com.corejava.basics.OOPs.inheritance;

public class Child extends Parent {
    static String name="raju";
    static double height=5.9;

    public static void demo1()
    {
        System.out.println("demo1() ");
    }

    static
    {
        System.out.println("static block - child");
    }
    public static void main(String[] args) {
        System.out.println(name);
        System.out.println(height);
        demo();
        demo1();
    }
}
