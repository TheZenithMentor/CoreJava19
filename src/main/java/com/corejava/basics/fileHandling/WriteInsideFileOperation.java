package com.corejava.basics.fileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteInsideFileOperation {
    public static void main(String[] args) {
        File obj = new File("D:\\filehandling\\Lecture1\\hello.txt");
        FileWriter fw = null;
        String data = "HI i am learning java file handling and I didn't understand";
        try {
            fw = new FileWriter(obj);
            fw.write(data);  // write and flush
            fw.flush();
            System.out.println("Data is written inside the file ");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                fw.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
// 20 min : 