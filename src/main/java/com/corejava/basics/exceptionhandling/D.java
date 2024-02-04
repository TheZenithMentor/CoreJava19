package com.corejava.basics.exceptionhandling;

public class D {
    public static void main(String[] args) {

        //.StringIndexOutOfBoundsException
        String r="hello";
        System.out.println("1");
        System.out.println(r.charAt(0));
        System.out.println(r.charAt(1));
        try {
            System.out.println(r.charAt(5));
        }
        catch (StringIndexOutOfBoundsException obj)
        {
            System.out.println(obj);
            System.out.println("Exception handled");
        }

        System.out.println("2");
        System.out.println("3");
}
}
