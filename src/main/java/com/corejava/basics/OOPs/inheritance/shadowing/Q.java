package com.corejava.basics.OOPs.inheritance.shadowing;

public class Q extends P {
    public static void test()
    {
        System.out.println("test() - child");
    }

    public static void main(String[] args) {
        P obj1=new P();
        obj1.test(); //parent

        Q ref=new Q();
        ref.test();  // child

        P p= new Q();
        p.test();  //paremt
    }
}
