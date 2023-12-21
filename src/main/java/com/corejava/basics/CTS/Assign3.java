package com.corejava.basics.CTS;

public class Assign3 {
    public static void main(String[] args) {
        int a=10;
        if (a>10)
        {
            System.out.println("inside if");
            for(int i=0;i<2;i++)
            {
                System.out.println(i);
                if (i==1)
                {
                    break;
                }
            }
            System.out.println("hi");
        }
        System.out.println("end");
    }
}
