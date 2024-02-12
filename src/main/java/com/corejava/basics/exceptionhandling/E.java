package com.corejava.basics.exceptionhandling;

public class E {
    public static void main(String[] args) {

        String a="hello";

        try {

            try
            {
                int c=1/0;
            }
            catch (ArithmeticException e)
            {
                System.out.println("AE handled");
            }
            System.out.println(a.charAt(5));

        }
        catch (StringIndexOutOfBoundsException r)
        {
            System.out.println("SIOBE Handled");
        }
    }
}
