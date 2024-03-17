package com.corejava.basics.CollectionFramework.TreeSet;

import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet s=new TreeSet();
        s.add(1);
        s.add(3);
        s.add(2);
        s.add(2);
        s.add(4);
        System.out.println(s);
        /*
        *  ByDefault all the objects are sorted
        *
        *  the element to be added in the treeset must be comparable type
        *  if not then we will get CLassCastException
        *
        *
        *
        * */


    }
}
