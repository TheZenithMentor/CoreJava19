package com.corejava.basics.NonStatic.NSMethod;

public class B {
     int a ;

     public void test()
     {
         System.out.println("Test() method");
     }

    public static void main(String[] args) {
        B obj=new B();
        System.out.println(obj.a);
        obj.test();
    }
}
