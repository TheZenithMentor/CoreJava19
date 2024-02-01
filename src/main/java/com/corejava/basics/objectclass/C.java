package com.corejava.basics.objectclass;

public class C implements Cloneable {
    int a ;
    int b ;

    C(int a , int b)
    {
        this.a=a;
        this.b=b;
    }
    public static void main(String[] args) throws CloneNotSupportedException {
        C obj=new C(10,20);

        C obj1= (C) obj.clone();
        System.out.println(obj1.a);
        System.out.println(obj1.b);
    }

    
}
