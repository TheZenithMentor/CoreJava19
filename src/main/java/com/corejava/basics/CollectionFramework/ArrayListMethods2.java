package com.corejava.basics.CollectionFramework;


import java.util.ArrayList;

public class ArrayListMethods2 {
    // arraylist 1 , arraylist 2  : add those 2 arraylist

    public static void main(String[] args) {
        ArrayList obj=new ArrayList();
        obj.add("string");
        obj.add(12.05);


        // 2nd Arraylist
        ArrayList obj1=new ArrayList();
        obj1.add('b');
        obj1.add(123);


        // addAll() : used to add 2 arraylist one into another
        obj.addAll(obj1);

        // addAll(index , collection )

        System.out.println("1st arraylist "+obj);
        System.out.println("2nd arraylist "+obj1);

        // for each loop
        for(Object c:obj)
        {
            System.out.println(c);
        }

    }
}
/*
*   task : Create 2 arraylist and insert the collection in 1st index
*        : try out with the varient obj1.addAll(obj);
*
* */