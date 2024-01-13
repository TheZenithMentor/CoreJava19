package com.corejava.basics.NonStatic.NSBlock;

public class B {
    int a;

    // IIB(Instance Initializer Block)
    {
        a=10;
    }

    public static void main(String[] args) {
        B obj=new B();
        System.out.println(obj.a);
    }
}
