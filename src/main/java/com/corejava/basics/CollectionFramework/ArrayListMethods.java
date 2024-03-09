package com.corejava.basics.CollectionFramework;

import java.util.ArrayList;

public class ArrayListMethods {
    public static void main(String[] args) {
        ArrayList obj=new ArrayList();
        System.out.println("inside arraylist "+obj);

        //add object into arraylist : add()
        obj.add(1);
        obj.add(2);
        obj.add('b');
        System.out.println("After adding object"+obj);

        // insert at any position
        obj.add(2,"hello");
        System.out.println("updated arraylist"+ obj);

        // size of arraylist : size()
        System.out.println("Size of arrayList is "+obj.size());

        //get the element : get
        System.out.println("at index 1 valus is "+obj.get(1));

        // whether the list contains the elements : contains
        System.out.println(obj.contains("pune"));
        System.out.println(obj.contains("hello"));

        // return the index of element
        System.out.println("index of Object 'b'"+obj.indexOf('b'));


        // isEmpty : it is used to check the arraylist is empty or not
        System.out.println(obj.isEmpty());

        // task : create a empty arraylist and check with isEmpty method
    }
}
