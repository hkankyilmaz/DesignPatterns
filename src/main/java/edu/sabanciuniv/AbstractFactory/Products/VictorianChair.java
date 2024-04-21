package edu.sabanciuniv.AbstractFactory.Products;

public class VictorianChair implements Chair{

    @Override
    public void hasLegs() {
        System.out.println("Victorian Chair has 4 legs");
    }

    @Override
    public void sitOn() {
        System.out.println("You can sit on Victorian Chair");
    }

    @Override
    public void putThingsOn() {
        System.out.println("You can put things on Victorian Chair");
    }
}
