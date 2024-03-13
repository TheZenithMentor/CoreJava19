package com.corejava.basics.MultiThreading;

public class MultiThreadingExample  {
    public static void main(String[] args) {
        Thread1 obj=new Thread1();
        Thread2 obj2=new Thread2();
        obj.start();
        obj2.start();
    }



}

/*
* 1 . create two threads
* 2. create 3 threads with both approach
* */
