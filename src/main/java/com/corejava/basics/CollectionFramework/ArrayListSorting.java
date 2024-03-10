package com.corejava.basics.CollectionFramework;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSorting {
    public static void main(String[] args) {
        ArrayList obj=new ArrayList();
        obj.add(1);
        obj.add(4);
        obj.add(2);
        obj.add(3);

        Collections.sort(obj);
        System.out.println(obj);

        ArrayList obj1=new ArrayList();
        obj1.add(1);
        obj1.add('b');
        obj1.add(true);
        obj1.add("pune");

        Collections.sort(obj1); // CLassCastException
        System.out.println(obj1);


/* note : when we try to sort objects which is of incompatable type
* then we get a Exception called as ClassCastException
*
*
* task : what if we try to sort the following arraylist
*    ['c','b','a','d']
*    [2.5,2.3,1.2,1.8]
*    ["one","three","two"]
* */


    }
}
