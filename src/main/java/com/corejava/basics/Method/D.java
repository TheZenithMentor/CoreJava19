package com.corejava.basics.Method;

public class D {
   public static void alpha()
   {
       System.out.println("alpha()");
   }

   public static void alpha(int a)
   {
       System.out.println("alpha(int)");
       System.out.println(a);
   }
    public static void main(String[] args) {
        alpha(10);
        alpha('a'); // typecasting happend
    }
}

// in class more than two method with same name and different
// arguments , is known as method overloading