package com.corejava.basics.NonStatic;

public class C {
    int a;

    {
        int a=10;
        System.out.println(this.a);
    }
    public static void main(String[] args) {
        C obj=new C();

        // can i create more than one object of a same class : yes
        C obj1=new C();
        System.out.println(obj);
        System.out.println(obj1);

    }

}
