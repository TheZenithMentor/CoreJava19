package com.corejava.basics.OOPs.inheritance;

public class B extends  A {
    int b;
    public void test1()
    {
        System.out.println("test1() - B");
    }

    {
        System.out.println("NSB - B");
    }

    public static void main(String[] args) {
     B ref=new B();
        System.out.println(ref.a); // parent
        System.out.println(ref.b); // child
    }
}
