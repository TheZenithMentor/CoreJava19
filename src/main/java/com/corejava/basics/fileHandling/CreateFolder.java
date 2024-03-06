package com.corejava.basics.fileHandling;

import java.io.File;

public class CreateFolder {
    public static void main(String[] args) {
        // to point a file virtually we use File Class
        File obj=new File("D:\\filehandling\\Lecture1");

        if (obj.exists())
        {
            System.out.println("Folder is already created");
        }
        else {
            // mkdir()  : used to create a folder in the given path
            obj.mkdir();
            System.out.println("new Folder created ");
        }

    }
}
