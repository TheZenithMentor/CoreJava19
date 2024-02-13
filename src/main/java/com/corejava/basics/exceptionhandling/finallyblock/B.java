package com.corejava.basics.exceptionhandling.finallyblock;

public class B {
    public static void main(String[] args) {
        try
        {
            int a=1/0;
        }
        catch(StringIndexOutOfBoundsException e)
        {
            System.out.println(1);
        }
        finally {
            System.out.println("Finally block executed");
        }
    }
}
