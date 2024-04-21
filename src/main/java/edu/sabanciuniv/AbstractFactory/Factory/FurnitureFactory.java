package edu.sabanciuniv.AbstractFactory.Factory;

import edu.sabanciuniv.AbstractFactory.Products.Chair;
import edu.sabanciuniv.AbstractFactory.Products.Sofa;
import edu.sabanciuniv.AbstractFactory.Products.Table;

public interface FurnitureFactory {

    public Chair createChair();
    public Sofa createSofa();
    public Table createCoffeeTable();
}
