package edu.sabanciuniv.FactoryMethod2.Factory;

import edu.sabanciuniv.FactoryMethod2.Employees.Manager;

public interface ManagerFactory {
    public Manager createManager(String name, String department);
}
