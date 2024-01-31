package com.corejava.basics.objectclass;

public class Employee1 {
    String name;
    int eno;


    Employee1(String a, int b)
    {
        this.name=a;
        this.eno=b;
    }

    public int hashCode()
    {
        return 123;
    }
    public static void main(String[] args) {
        Employee1 obj=new Employee1("raj",22);
        System.out.println(obj);
        System.out.println(obj.hashCode());

    }
}


 // we use hashcode to calculate hash value in hashtables.

// assignment  try and implement the clone() method of object class