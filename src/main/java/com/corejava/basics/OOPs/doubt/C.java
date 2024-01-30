package com.corejava.basics.OOPs.doubt;

abstract  public class C {

    static int a ;
    public static void demo()
    {
        System.out.println("Deom()");
    }

    static
    {
        System.out.println("Static blck");
    }

    {
        System.out.println("NS");
    }
    public void test(){
        System.out.println("ns methid");
    }
    int b;

    C()
    {
        System.out.println("constructpr");
    }
    public static void main(String[] args) {
        C ref;
    }
}
