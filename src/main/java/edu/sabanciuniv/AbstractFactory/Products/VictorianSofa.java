package edu.sabanciuniv.AbstractFactory.Products;

public class VictorianSofa implements Sofa {

    @Override
    public void hasLegs() {
        System.out.println("Victorian Sofa has 4 legs");
    }

    @Override
    public void sitOn() {
        System.out.println("You can sit on Victorian Sofa");
    }

    @Override
    public void putThingsOn() {
        System.out.println("You can put things on Victorian Sofa");
    }


}
