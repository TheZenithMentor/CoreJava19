package com.corejava.basics.decisionStatements;

public class A1 {
    public static void main(String[] args)
    {
        /* Switch case statement */
        char res='c';
        switch (res)
        {
            case 'a' : {
                System.out.println("input is a");
                break;
            }

            case 'b' : {
                System.out.println("input is b");
                break;
            }

            case 'c' : {
                System.out.println("input is c");
                break;
            }

            default:{
                System.out.println("invalid input ");
            }
        }
    }
}
