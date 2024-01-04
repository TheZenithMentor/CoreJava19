package com.corejava.basics.Method.ReturnType;

public class A {
    public static String welcome(String name,long mobile)
    {
        System.out.println("Welcome "+name);
        return name;

    }

    public static void printBill(String customerName)
    {
        System.out.println("Bill generated for user "+customerName);
    }

    public static void main(String[] args) {
        String res=welcome("rahul",11111111);
        printBill(res);
        System.out.println(res);

    }
}
