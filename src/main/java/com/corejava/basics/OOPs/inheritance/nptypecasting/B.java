package com.corejava.basics.OOPs.inheritance.nptypecasting;

public class B extends A {
    public void bmethod()
    {
        System.out.println("method - B");
    }

    public static void main(String[] args) {

//        B obj=new B();
////        System.out.println(obj);
////        // upcast from B-> A
////        A ref=obj;
////        System.out.println(obj);
////        System.out.println(ref);
//
//        obj.amethod();
//        obj.bmethod();
//
//        A ref=obj;
//        ref.amethod();
////        ref.bmethod();

        // downcasting A -> B

        B obj=new B();
        A ref=obj;

        B obj1=(B) ref;

    }
}
