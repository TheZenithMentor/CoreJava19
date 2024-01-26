package com.corejava.basics.OOPs.inheritance.methodoverridding;

public class GpayNewPaymentWay extends Gpay {

    public  void payment()
    {
        System.out.println("EMI available");
    }

    public static void main(String[] args) {
        GpayNewPaymentWay obj=new GpayNewPaymentWay();
        Gpay obj1=obj;
        obj1.payment();

    }
}
