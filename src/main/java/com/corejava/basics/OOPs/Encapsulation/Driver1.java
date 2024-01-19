package com.corejava.basics.OOPs.Encapsulation;

public class Driver1 {
    public static void main(String[] args) {
        Employee emp1=new Employee("Arun",112,33000.65);
        emp1.print();
        System.out.println("-----------");
//        System.out.println(emp1.esal);
          double esal=emp1.getEsal();
        System.out.println(esal);
        emp1.setEsal(40000.65); // sal got updated
        emp1.print();

    }
}
