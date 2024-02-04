package com.corejava.basics.wrapperclasses;

public class B {

    public static void main(String[] args) {
        //object into PDT
        Integer obj=10;
        int a=obj;
        System.out.println(obj);
        System.out.println(a);


//        Integer obj1=20;
//        int a1=obj1.valueOf(obj1);
//        System.out.println(obj1);
//        System.out.println(a1);

        Integer obj1=20;
        int a1=obj1.intValue(); // yyyValue method . yyy-corresponding datatype
        System.out.println(obj1);
        System.out.println(a1);
    }
}
//assignment : try to check boxing and autoboxing for the remaining primitive data types