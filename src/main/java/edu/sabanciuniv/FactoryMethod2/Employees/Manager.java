package edu.sabanciuniv.FactoryMethod2.Employees;

public class Manager implements Workable {

    private String name;
    private String department;

    public Manager(String name, String department) {
    }

    @Override
    public void work() {
        System.out.println("Manager is working");

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


}
