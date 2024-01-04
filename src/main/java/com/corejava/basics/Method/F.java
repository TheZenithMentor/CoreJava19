package com.corejava.basics.Method;

public class F {
    public static void main()
    {
        System.out.println("main()");
    }

    public static void main(int a)
    {
        System.out.println("main(int)");
    }
    public static void main(String[] args) {
        System.out.println("main(String[])");
        main();
    }
}
