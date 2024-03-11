package com.corejava.basics.GarbageCollection;

public class Student {
    String name="rahul";
    int age=18;

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object removed");
    }

    public static void main(String[] args) {
        Student s=new Student();
        System.out.println(s.name+" and "+s.age);
        s=null;
        System.gc();
        for(int i=0;i<5;i++)
        {
            System.out.println(i);
        }
    }
}
