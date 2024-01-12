package com.corejava.basics.NonStatic.NSMethod;

public class A {
    // a method which is not prefixed by static keyword is known as NS Methid

    public  void demo()
    {
        System.out.println("demo()");
    }

    public static void main(String[] args) {
//        demo();
//        A.demo();

        // creating a object to load NS member of the class
        A ref=new A();
        System.out.println(ref);

    }

}
