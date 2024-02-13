package com.corejava.basics.exceptionhandling.finallyblock;

public class A {
    public static void main(String[] args) {
        try
        {
            int a=1/0;
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
