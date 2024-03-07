package com.corejava.basics.fileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFromFileOperation {
    public static void main(String[] args) {
        File obj=new File("D:\\filehandling\\Lecture1\\hello.txt");
        System.out.println(obj.length());
        long length=obj.length();
        char []data=new char[(int) length];
        FileReader fr=null;
        try {
            fr=new FileReader(obj);
            fr.read(data);
            System.out.println(data);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        finally {
            try {
                fr.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
