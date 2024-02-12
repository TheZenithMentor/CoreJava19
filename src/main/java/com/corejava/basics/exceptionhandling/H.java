package com.corejava.basics.exceptionhandling;

public class H {
    public static void login(String name)
    {
        if(name=="rahul")
        {
            System.out.println("Welcome to the database");
        }
        else{
           //create my custom exception
            throw new NullPointerException("unauthorised user");
        }
    }

    public static void main(String[] args) {
        login("ramesh");
    }
}
