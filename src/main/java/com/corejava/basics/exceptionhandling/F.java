package com.corejava.basics.exceptionhandling;

public class F {
    public static void main(String[] args) {
        try
        {
//            int a=1/0;
            String s="hello";
            System.out.println(s.charAt(5));
        }
        catch(ArithmeticException e)
        {
            System.out.println("1 catch block");
        }
        catch(Exception e)
        {
            System.out.println("2 catch block");
        }
    }
}

// assignment : try to handle 4 exception with nested try and catch block