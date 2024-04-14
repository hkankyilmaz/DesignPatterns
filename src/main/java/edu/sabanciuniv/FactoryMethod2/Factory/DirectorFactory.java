package edu.sabanciuniv.FactoryMethod2.Factory;

import edu.sabanciuniv.FactoryMethod2.Employees.Director;

public interface DirectorFactory {

    public Director createDirector(String name, String department, int numberOfEmployees);
}
