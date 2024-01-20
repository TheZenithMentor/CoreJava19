package com.corejava.basics.OOPs.relationship.HasARelation;

public class Engine {
    String engineno;
    int model;

    Engine(String en,int model)
    {
        this.engineno=en;
        this.model=model;
    }

    public void print()
    {
        System.out.println("engine number is "+engineno);
        System.out.println("engine model is "+model);
    }

}
