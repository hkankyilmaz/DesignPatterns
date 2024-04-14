package edu.sabanciuniv.FactoryMethod2.Employees;

public class Employee implements Workable {

    private String name;
    public Employee(String name) {
    }

    @Override
    public void work() {
        System.out.println("Employee is working");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
