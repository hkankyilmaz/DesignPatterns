package edu.sabanciuniv.FactoryMethod2.Factory;

import edu.sabanciuniv.FactoryMethod2.Employees.Employee;

public interface EmployeeFactory {

    public Employee createEmployee(String name);


}
