package com.corejava.basics.OOPs.inheritance;

 class C {
    C()
    {
        this(10);
        System.out.println("C()");
    }

     C(int i)
     {

         System.out.println("C(int)");
     }

    public static void main(String[] args) {
        C obj=new C();
    }
}

// this vs this() : assignments

// mock : saturday (theory + code )