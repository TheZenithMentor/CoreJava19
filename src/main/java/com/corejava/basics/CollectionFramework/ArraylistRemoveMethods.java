package com.corejava.basics.CollectionFramework;

import java.util.ArrayList;
import java.util.Collections;

public class ArraylistRemoveMethods {
    public static void main(String[] args) {
        ArrayList obj = new ArrayList();
        obj.add(10);
        obj.add(40);
        obj.add(20);
        obj.add(30);

        //remove :remove the element
        System.out.println(obj.remove(1));  //40
        System.out.println(obj); // [10,20,30]
        System.out.println(obj.remove(Integer.valueOf(20))); //[boolean ]
        System.out.println(obj);

    }
}
/*
*  task : try out the removing remain Object type [Stirng ,boolean ......]
* */
