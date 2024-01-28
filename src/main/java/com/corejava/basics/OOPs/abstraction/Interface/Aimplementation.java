package com.corejava.basics.OOPs.abstraction.Interface;

public class Aimplementation implements A{

    @Override
    public void demo() {
        System.out.println("demo method");
    }

    public static void main(String[] args) {

       Aimplementation b =new Aimplementation();
       A a=b;

       // A a= new Aimplemetatiom();
        a.demo();
    }
}
