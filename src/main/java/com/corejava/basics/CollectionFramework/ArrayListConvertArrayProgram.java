package com.corejava.basics.CollectionFramework;

import java.util.ArrayList;
import java.util.Collections;
/*Convert the arraylist into the array*/
public class ArrayListConvertArrayProgram {
    public static void main(String[] args) {
        ArrayList obj = new ArrayList();
        obj.add(1);
        obj.add(4);
        obj.add(2);
        obj.add(3);

        Object [] a =obj.toArray(); // converted to array
        //length operation
        for(int i=0;i<a.length;i++)
        {
            System.out.println("value at index "+i+" is "+a[i]);
        }
        System.out.println("array length is "+a.length);
    }
}
