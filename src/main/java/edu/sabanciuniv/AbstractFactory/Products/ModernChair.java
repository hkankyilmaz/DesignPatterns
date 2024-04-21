package edu.sabanciuniv.AbstractFactory.Products;

public class ModernChair implements Chair {

    @Override
    public void hasLegs() {
        System.out.println("Modern Chair has 4 legs");
    }

    @Override
    public void sitOn() {
        System.out.println("Sitting on Modern Chair");
    }

    @Override
    public void putThingsOn() {
        System.out.println("Putting things on Modern Chair");
    }

}
