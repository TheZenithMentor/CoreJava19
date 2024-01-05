package com.corejava.basics.Static.Variable;

public class A {

    static int a=30;
    public static void main(String[] args) {
        // direct
        System.out.println(a);

        // Class name as Reference
        // syntax : classname.variable_name
        System.out.println(A.a);
    }


}
