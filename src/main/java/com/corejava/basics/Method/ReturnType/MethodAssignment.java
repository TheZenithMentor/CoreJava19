package com.corejava.basics.Method.ReturnType;

public class MethodAssignment {

    public static double calulatePrice(int unitSpent)
    {
        double price = unitSpent *10;
        return price;
    }

    public static void printBill(String name , int pricePerUnit, int unitSpent , double billPrice)
    {
        System.out.println("Customer name is "+name);
        System.out.println("Price Per Unit "+pricePerUnit);
        System.out.println("Total unit Spent "+unitSpent);
        System.out.println("Total Bill Generated "+billPrice);
    }

    public static void main(String[] args) {
        double totalPrice=calulatePrice(100);
        printBill("Rahul",10,100,totalPrice);
    }


}
