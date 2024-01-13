package com.corejava.basics.NonStatic.Constructor;

public class C {

    C()
    {
        // statements
        System.out.println("Constructor called ");
    }

    public static void main(String[] args) {
        C ref=new C();
    }
}
