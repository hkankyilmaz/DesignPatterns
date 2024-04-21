package edu.sabanciuniv.AbstractFactory.Factory;

import edu.sabanciuniv.AbstractFactory.Products.*;

public class ModernFurniture implements FurnitureFactory{

    @Override
    public Chair createChair() {
        return new ModernChair();
    }

    @Override
    public Sofa createSofa() {
        return new ModernSofa();
    }

    @Override
    public Table createCoffeeTable() {
        return new ModernTable();
    }
}
