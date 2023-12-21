package com.corejava.basics.CTS;

import javax.swing.*;

public class Assign2 {
    public static void main(String[] args) {
        int i=0;
        while(i<3)
        {
            if (i==2)
            {
                System.out.println("inside if");
            }
            break;
        }
        System.out.println("end");
    }
}
