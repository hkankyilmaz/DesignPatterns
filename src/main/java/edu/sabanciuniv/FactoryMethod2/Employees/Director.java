package edu.sabanciuniv.FactoryMethod2.Employees;

public class Director implements Workable {

    private String name;
    private String department;
    private int numberOfEmployees;
    public Director(String name, String department, int numberOfEmployees) {
    }

    @Override
    public void work() {
        System.out.println("Director is working");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }


}
