package edu.sabanciuniv.FactoryMethod2;

import edu.sabanciuniv.FactoryMethod2.Factory.DirectorFactory;
import edu.sabanciuniv.FactoryMethod2.Factory.EmployeeFactory;
import edu.sabanciuniv.FactoryMethod2.Factory.ManagerFactory;
import edu.sabanciuniv.FactoryMethod2.FactoryImplementation.DirectorFactoryImplementation;
import edu.sabanciuniv.FactoryMethod2.FactoryImplementation.EmployeeFactoryImplementation;
import edu.sabanciuniv.FactoryMethod2.FactoryImplementation.ManagerFactoryImplementation;

public class App {

    public static void main(String[] args) {

        EmployeeFactory employeeFactory = new EmployeeFactoryImplementation();
        employeeFactory.createEmployee("Hakan").work();

        ManagerFactory managerFactory = new ManagerFactoryImplementation();
        managerFactory.createManager("Hakan","IT").work();

        DirectorFactory directorFactory = new DirectorFactoryImplementation();
        directorFactory.createDirector("Hakan","IT",30).work();



    }
}
