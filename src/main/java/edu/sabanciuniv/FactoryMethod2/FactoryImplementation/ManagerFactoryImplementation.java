package edu.sabanciuniv.FactoryMethod2.FactoryImplementation;

import edu.sabanciuniv.FactoryMethod2.Employees.Manager;
import edu.sabanciuniv.FactoryMethod2.Factory.ManagerFactory;

public class ManagerFactoryImplementation implements ManagerFactory {

    @Override
    public Manager createManager(String name, String department) {
        return new Manager(name, department);
    }

}
