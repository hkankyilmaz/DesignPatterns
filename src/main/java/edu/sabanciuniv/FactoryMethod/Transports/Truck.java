package edu.sabanciuniv.FactoryMethod.Transports;

public class Truck implements Transport{

        @Override
        public void deliver() {
            System.out.println("Delivering by truck");
        }
}
