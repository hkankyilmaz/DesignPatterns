package edu.sabanciuniv.FactoryMethod2.FactoryImplementation;

import edu.sabanciuniv.FactoryMethod2.Employees.Employee;
import edu.sabanciuniv.FactoryMethod2.Factory.EmployeeFactory;

public class EmployeeFactoryImplementation implements EmployeeFactory {
    @Override
    public Employee createEmployee(String name) {
        return new Employee(name);
    }
}
