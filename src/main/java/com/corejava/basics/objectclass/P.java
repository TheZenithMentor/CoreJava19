package com.corejava.basics.objectclass;

public class P {
    public static void main(String[] args) {
        P obj=new P();  // object1
        System.out.println(obj);
        P obj1=new P(); // object2
        System.out.println(obj1);
        System.out.println(obj1.equals(obj));


        P obj2=obj1;
        System.out.println(obj2.equals(obj1));


    }
}
