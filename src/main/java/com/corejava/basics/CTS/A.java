package com.corejava.basics.CTS;

public class A {
    public static void main(String[] args) {
        System.out.println("start");
        for(int i=0;i<3;i++)
        {
            if (i==2)
            {
                break;
            }
            System.out.println(i);

        }
        System.out.println("end");
    }
}
