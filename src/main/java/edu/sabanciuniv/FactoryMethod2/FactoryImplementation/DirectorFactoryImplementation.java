package edu.sabanciuniv.FactoryMethod2.FactoryImplementation;

import edu.sabanciuniv.FactoryMethod2.Employees.Director;
import edu.sabanciuniv.FactoryMethod2.Factory.DirectorFactory;

public class DirectorFactoryImplementation implements DirectorFactory {
    @Override
    public Director createDirector(String name, String department, int numberOfEmployees) {
        return new Director(name, department, numberOfEmployees);
    }
}
