package com.corejava.basics.MultiThreading;

public class ThreadPropertiesExample {
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
        System.out.println("Thread1 priority "+obj.getPriority());
        obj.setPriority(1);
        obj.start();
        obj1.start();

        System.out.println("Thread1 name is "+obj.getName());
        obj.setName("Babubhaiya");
        System.out.println("Thread1 name is "+obj.getName());
        System.out.println("ID of thread "+obj.getId());



    }
}
