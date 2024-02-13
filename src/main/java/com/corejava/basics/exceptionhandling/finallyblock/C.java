package com.corejava.basics.exceptionhandling.finallyblock;

public class C {
    public static void main(String[] args) {
        try
        {
            System.out.println("2");
        }
        catch(ArithmeticException e)
        {
            System.out.println(1);
        }
        finally {
            System.out.println("Finally block executed");
        }
    }
}
