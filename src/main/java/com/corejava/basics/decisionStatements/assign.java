package com.corejava.basics.decisionStatements;

public class assign {
    public static void main(String[] args) {
        int num1=10;
        int num2=20;
        switch (num1-num2)
        {
            case -10 :{
                System.out.println(num2);
                break;
            }

            default:{
                System.out.println(num1);
            }

        }
    }
}
