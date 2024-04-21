package edu.sabanciuniv.AbstractFactory.Products;

public class ModernSofa implements Sofa{

    @Override
    public void hasLegs() {
        System.out.println("Modern Sofa has 4 legs");
    }

    @Override
    public void sitOn() {
        System.out.println("You can sit on Modern Sofa");
    }

    @Override
    public void putThingsOn() {
        System.out.println("You can put things on Modern Sofa");
    }
}
