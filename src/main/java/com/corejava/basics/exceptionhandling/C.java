package com.corejava.basics.exceptionhandling;

public class C {
    public static void main(String[] args) {

        //.StringIndexOutOfBoundsException
        String r="hello";
        System.out.println(r.charAt(0));
        System.out.println(r.charAt(1));
        System.out.println(r.charAt(5));
    }
}
