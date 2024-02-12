package com.corejava.basics.exceptionhandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class G {
    public static void main(String[] args) throws FileNotFoundException {
        FileReader file=new FileReader("C:\\Users\\Hemendra Singh\\Desktop\\abcd.txt");
    }
}

// assignment : write the same program using try and catch