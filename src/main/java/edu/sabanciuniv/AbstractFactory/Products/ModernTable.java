package edu.sabanciuniv.AbstractFactory.Products;

public class ModernTable implements Table{

        @Override
        public void hasLegs() {
            System.out.println("Modern Table has 4 legs");
        }

        @Override
        public void sitOn() {
            System.out.println("You can sit on Modern Table");
        }

        @Override
        public void putThingsOn() {
            System.out.println("You can put things on Modern Table");
        }
}
