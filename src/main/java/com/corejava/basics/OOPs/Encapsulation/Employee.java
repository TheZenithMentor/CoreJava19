package com.corejava.basics.OOPs.Encapsulation;

public class Employee {
    String ename;
    int eid;
    private double esal;

    //getter method : read and setter method : modify

    //getter method
    public double getEsal()
    {
        return this.esal;
    }

    //setter method
    public void setEsal(double sal)
    {
        this.esal=sal;
    }

    Employee(String name , int id ,double sal){
        this.ename=name;
        this.eid=id;
        this.esal=sal;
    }

    public void print()
    {
        System.out.println("emp name is "+this.ename);
        System.out.println("emp id is "+this.eid);
        System.out.println("emp sal is "+this.esal);
    }


}
/* private members can be access inside the same class but can't be accessed
*  outside the class eventhough it is private
*
* */
