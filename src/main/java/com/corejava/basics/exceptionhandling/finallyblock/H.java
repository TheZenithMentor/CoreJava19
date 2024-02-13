package com.corejava.basics.exceptionhandling.finallyblock;

public class H {
    public static void M()
    {
      int a=1/0;
    }
    public static void N()
    {
        M();
    }

    public static void main(String[] args) {
       try {
           N();
       }
       catch (ArithmeticException e)
       {
           System.out.println("Exception handled");
       }
    }
}
