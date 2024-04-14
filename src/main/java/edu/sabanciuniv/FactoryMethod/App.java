package edu.sabanciuniv.FactoryMethod;

import edu.sabanciuniv.FactoryMethod.Factory.ShipCreater;
import edu.sabanciuniv.FactoryMethod.Factory.TransportFactory;
import edu.sabanciuniv.FactoryMethod.Factory.TruckCreater;
import edu.sabanciuniv.FactoryMethod.Transports.Transport;

public class App {

    public static void main(String[] args) {
        TransportFactory factory = new TruckCreater();
        Transport transport = factory.create();
        transport.deliver();

        factory = new ShipCreater();
        transport = factory.create();
        transport.deliver();
    }
}
