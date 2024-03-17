package com.corejava.basics.MultiThreading;

public class ThreadSleep {
    public static void main(String[] args) {

        Runnable r=()->{
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            for(int i=0;i<5;i++)
            {
                System.out.println("Thread  - 1");
            }
        };

        Runnable r1=()->{
            for(int i=0;i<5;i++)
            {
                System.out.println("Thread  - 2");
            }
        };

        Runnable r2=()->{
            for(int i=0;i<5;i++)
            {
                System.out.println("Thread  - 3");
            }
        };


        Thread obj=new Thread(r);
        Thread obj1=new Thread(r1);
        Thread obj2=new Thread(r2);
        obj.start();
        obj1.start();
        obj2.start();

    }

}
