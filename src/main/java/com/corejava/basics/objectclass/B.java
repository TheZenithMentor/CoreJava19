package com.corejava.basics.objectclass;

public class B {
    int a;

    B(int a){
        this.a=a;
    }

    public boolean equals(Object v)
    {
        System.out.println(this.a);
        if (this.a==((B)v).a){
            return true;
        }
        return  false;
    }
    public static void main(String[] args) {
        B obj1=new B(10);
//        System.out.println(obj1.a);

        B obj2=new B(20);
//        System.out.println(obj2.a);
        System.out.println(obj1.equals(obj2));;
    }

}
