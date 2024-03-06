package com.corejava.basics.fileHandling;

import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) {
        File obj=new File("D:\\filehandling\\Lecture1\\hello.txt");
        if(obj.exists())
        {
            System.out.println("File is already created");
        }
        else
        {
            try {
                //createNewFile() : used to create a new file
                obj.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            System.out.println("new file created ");
        }
    }
}
