package com.java.programming.arrays;

public class C {
    public static void main(String[] args) {
        int []a=new int[5];
        a[0]=1;
        a[1]=2;
        a[3]=3;

        // access the value a[5]
        System.out.println(a[5]); // arrayindexoutofbounds exception
    }
}
