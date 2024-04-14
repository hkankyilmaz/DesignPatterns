package edu.sabanciuniv.FactoryMethod.Factory;

import edu.sabanciuniv.FactoryMethod.Transports.Ship;
import edu.sabanciuniv.FactoryMethod.Transports.Transport;

public class ShipCreater extends TransportFactory {

    @Override
    public Transport create() {
        return new Ship();
    }
}
