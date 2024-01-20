package com.corejava.basics.OOPs.relationship.HasARelation;

public class Bike {
    String bikename;
    double bikeprice;
    Engine obj;// obj is of type Engine

    Bike(String bname,double bprice,Engine ref){
        this.bikename=bname;
        this.bikeprice=bprice;
        this.obj=ref;
    }

    public void printdetails()
    {
        System.out.println("bike name is "+bikename);
        System.out.println("bike price is "+bikeprice);
        System.out.println("engine no is "+obj.engineno);
        System.out.println("engine model is "+obj.model);
    }

    public static void main(String[] args) {
        Engine e=new Engine("AD123",1101);
        Bike b=new Bike("splender",80000,e);
        b.printdetails();
    }


}
