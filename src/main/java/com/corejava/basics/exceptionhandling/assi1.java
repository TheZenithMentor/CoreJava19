package com.corejava.basics.exceptionhandling;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class assi1 {

    public static void main(String[] args)  {
        try
        {
            FileReader file=new FileReader("C:\\Users\\Hemendra Singh\\Desktop\\abcd.txt");
        }
        catch(FileNotFoundException e)
        {
            System.out.println("Exception handled");
        }

    }
}
