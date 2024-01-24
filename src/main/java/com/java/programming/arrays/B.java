package com.java.programming.arrays;

public class B {
    public static void main(String[] args) {
        int []a=new int[5];
        // a[0]
        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);

        // insert the value in the array
        a[0]=10;
        a[1]=20;
        a[2]=30;
        // print the array

        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
    }
}
// store values in the array of double and calculate the average