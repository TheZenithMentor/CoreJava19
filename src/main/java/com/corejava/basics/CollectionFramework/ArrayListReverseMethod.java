package com.corejava.basics.CollectionFramework;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListReverseMethod {
    public static void main(String[] args) {
        ArrayList obj = new ArrayList();
        obj.add(1);
        obj.add(4);
        obj.add(2);
        obj.add(3);

        // reverse method :
        Collections.reverse(obj); //[1,4,2,3] -> [3,2,4,1]
        System.out.println(obj);
    }

}
