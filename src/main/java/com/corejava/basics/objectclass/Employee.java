package com.corejava.basics.objectclass;

public class Employee {
    String name;
    int eno;


    Employee(String a, int b)
    {
        this.name=a;
        this.eno=b;
    }

    public String toString()
    {
        return "INF"+this.eno;
    }
    public static void main(String[] args) {
        Employee e1=new Employee("Rahul", 01);
        System.out.println(e1.toString());
        Employee e2=new Employee("ajay", 23);
        System.out.println(e2.toString());
    }
}
