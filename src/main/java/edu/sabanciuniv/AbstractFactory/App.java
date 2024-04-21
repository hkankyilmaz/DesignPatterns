package edu.sabanciuniv.AbstractFactory;

import edu.sabanciuniv.AbstractFactory.Factory.FurnitureFactory;
import edu.sabanciuniv.AbstractFactory.Factory.ModernFurniture;
import edu.sabanciuniv.AbstractFactory.Products.Chair;
import edu.sabanciuniv.AbstractFactory.Products.Sofa;
import edu.sabanciuniv.AbstractFactory.Products.Table;

public class App {

    public static void main(String[] args) {

        FurnitureFactory factory = new ModernFurniture();

        Chair chair = factory.createChair();
        Sofa sofa = factory.createSofa();
        Table table = factory.createCoffeeTable();

        chair.hasLegs();
        chair.sitOn();
        chair.putThingsOn();


    }
}
