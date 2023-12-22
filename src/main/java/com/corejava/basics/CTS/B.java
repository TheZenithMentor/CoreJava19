package com.corejava.basics.CTS;

public class B {
    public static void main(String[] args) {
        System.out.println("start");
        for(int i=0;i<3;i++)
        {
            if (i==1)
            {
                break;

            }
            System.out.println(i);

        }
        System.out.println("end");
    }
}
