package edu.sabanciuniv.FactoryMethod.Factory;

import edu.sabanciuniv.FactoryMethod.Transports.Transport;
import edu.sabanciuniv.FactoryMethod.Transports.Truck;

public class TruckCreater extends TransportFactory{

    @Override
    public Transport create() {
        return new Truck();
    }
}
