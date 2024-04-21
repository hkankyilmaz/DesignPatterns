package edu.sabanciuniv.AbstractFactory.Products;

public class VictorianTable implements Table{

    @Override
    public void hasLegs() {
        System.out.println("Victorian Table has 4 legs.");
    }

    @Override
    public void sitOn() {
        System.out.println("You can sit on Victorian Table.");
    }

    @Override
    public void putThingsOn() {
        System.out.println("You can put things on Victorian Table.");
    }
}
