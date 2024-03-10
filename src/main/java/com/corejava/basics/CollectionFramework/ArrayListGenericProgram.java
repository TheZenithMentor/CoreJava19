package com.corejava.basics.CollectionFramework;

import java.util.ArrayList;

public class ArrayListGenericProgram {
    public static void main(String[] args) {
        ArrayList<Integer> obj=new ArrayList<Integer>();
        obj.add(1);
        obj.add(4);


//        obj.add('b');
//        obj.add(true);

        //iterate the arraylist
        for(int i=0;i<obj.size();i++)
        {
            System.out.println("value at index "+i+" is "+obj.get(i));
        }
        System.out.println("--------------------------");
        // advanced for loop (for each loop)
//        for(Object v:obj)
//        {
//            System.out.println(v);
//        }

        for(Integer v:obj)
        {
            System.out.println(v);
        }
        System.out.println(obj);
    }
}
/*
* task : try to create generic arraylist with the remaining wrapper class
*      : difference between  for loop and for each loop
*
* */