package edu.sabanciuniv.FactoryMethod.Transports;

public class Ship implements Transport{

            @Override
            public void deliver() {
                System.out.println("Delivering by ship");
            }
}
