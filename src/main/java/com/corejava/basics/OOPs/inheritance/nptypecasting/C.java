package com.corejava.basics.OOPs.inheritance.nptypecasting;

public class C extends A{
    public void cmethod()
    {
        System.out.println("method- C");
    }

    public static void main(String[] args) {
        A obj=new A();
        C ref=(C) obj;
        ref.cmethod();
    }
}
