package com.corejava.basics.NonStatic.Constructor;

public class F {
    F()
    {
        System.out.println("constructor()");
    }

    F(int a)
    {
        System.out.println("Constructor(int)");
    }

    public static void main(String[] args) {
        F obj=new F(10);
    }
}
/* Constructor Overloading : When we have more than one cons with
*                             different args known as constructor
*                               overloading
*
* */
