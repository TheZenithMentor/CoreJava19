package com.corejava.basics.MultiThreading;

public class Thread2 extends Thread{
    @Override
    public void run() {
        for (int i=0;i<10;i++)
        {
            System.out.println("THREAD _ 2");
        }
    }
}
