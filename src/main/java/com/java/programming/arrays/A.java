package com.java.programming.arrays;

public class A {
    public static void main(String[] args) {

        // create an array : 1 approach
        int a[]={10,20,30,40,50};
        System.out.println(a);

        // access the value present inside the array object

        System.out.println("at index 0 "+a[0]);
        System.out.println("at index 1 "+a[1]);
        System.out.println("at index 2 "+a[2]);
        System.out.println("at index 3 "+a[3]);
        System.out.println("at index 4 "+a[4]);

        // length variable /; length of a array
        System.out.println("length of array is "+a.length);

        // last index'
        System.out.println("last index is "+(a.length-1));

        //assigning the value
        a[2]=90;
        System.out.println("updated value is "+a[2]);
    }
}
