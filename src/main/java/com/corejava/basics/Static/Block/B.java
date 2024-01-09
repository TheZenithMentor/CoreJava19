package com.corejava.basics.Static.Block;

public class B {

    static
    {
        System.out.println("Static Block -1 ");
    }
    public static void main(String[] args) {
        System.out.println("main method");
    }
    static
    {
        System.out.println("Static block -2");
    }


}
