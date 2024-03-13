package com.corejava.basics.MultiThreading;

public class ThreadUsingRunnableInterface {
    public static void main(String[] args) {

        Runnable r=()->{
            for(int i=0;i<10;i++)
            {
                System.out.println("Thread  - 1");
            }
        };

        Runnable r1=()->{
            for(int i=0;i<10;i++)
            {
                System.out.println("Thread  - 2");
            }
        };


        Thread obj=new Thread(r);
        Thread obj1=new Thread(r1);
        obj.start();
        obj1.start();

    }
}
