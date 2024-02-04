package com.corejava.basics.wrapperclasses;

public class C {
    public static void main(String[] args) {
        // PDT into String

        int a=10;
        String s =String.valueOf(a);
        System.out.println(a);
        System.out.println(s);

     //string into pdt

        String str="20";
        int c=Integer.parseInt(str);
        System.out.println(c);
        System.out.println(str);



        // numberformat exception : when we try to convert string into pdt and the string is not convertable string
        String str1="A";
        int c1=Integer.parseInt(str);
        System.out.println(c1);
        System.out.println(str);
    }
}

