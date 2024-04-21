package edu.sabanciuniv.AbstractFactory.Factory;

import edu.sabanciuniv.AbstractFactory.Products.*;

public class VictorianFurniture implements FurnitureFactory{

    @Override
    public Chair createChair() {
        return new VictorianChair();
    }

    @Override
    public Sofa createSofa() {
        return new VictorianSofa();
    }

    @Override
    public Table createCoffeeTable() {
        return new VictorianTable();
    }
}
