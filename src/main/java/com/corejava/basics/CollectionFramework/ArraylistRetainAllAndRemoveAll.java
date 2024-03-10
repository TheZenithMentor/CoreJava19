package com.corejava.basics.CollectionFramework;

import java.util.ArrayList;

public class ArraylistRetainAllAndRemoveAll {
    public static void main(String[] args) {
        ArrayList obj=new ArrayList();
        obj.add(1);
        obj.add(2);
        obj.add(3);

        ArrayList obj1=new ArrayList();
        obj1.add(1);
        obj1.add(true);
        obj1.add(3);

        //removeAll();
        obj.removeAll(obj1);
        System.out.println(obj);
        System.out.println(obj1);
    }


}
