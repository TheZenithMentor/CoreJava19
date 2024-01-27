package com.corejava.basics.OOPs.abstraction;

public class GpayImplementation extends Zomato{

    @Override
    public void paymentByGpay() {
        System.out.println("payment started by gpay");
    }

    public static void main(String[] args) {
        GpayImplementation gpay=new GpayImplementation();
        Zomato z=gpay;
        z.paymentByGpay();

    }
}
