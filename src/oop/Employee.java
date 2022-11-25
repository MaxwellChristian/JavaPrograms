
/*
*
*
*
Class is a design
Object is the instance of a class
	all the normal members are provided as local copy to each object created

Person
	name
	dob
	gender
	address

Person p1 = new Person();
Person p2 = new Person();

p1
	name
	dob
	gender
	address

p2
	name
	dob
	gender
	address

------------------------------------

Employee
	employeeId
	name *
	jobPosition
	dateWorkingSince
	dob *
	gender *
	address *

JAVA provides mechanism for re-usability
	- composition [part-of relationship]
		e.g. arm is a part of hand [object of 'Arm' class is a part of 'Hand' class]
		e.g. engine is a part of car [object of 'Engine' class is a part of 'Car' class]

	- inheritance [is-a relationship, also refereed as parent-child relationship]
		e.g. employee is a person ['Employee' class is a subclass of 'Person' class]
		e.g. student is a person ['Student' class ia a subclass of 'Person' class]
		*
		* subclass is the child class i.e., Employee
		* base class is the parent class i.e., Person

* */

package oop;

// is-a : Employee is a Person
// class Child extends Parent

public class Employee extends Person {

    // as we have extended Person class,
    // Employee gets all members inherited from Person class
    // i.e, Employee gets different member variables and methods from Person class

    // below-mentioned are the unique/new members that are specific/new-added by Employee class
    String employeeID;
    int ddStartedWorking;
    int mmStartedWorking;
    int yyyyStartedWorking;
    String jobPosition;

    public Employee() {
        // the super class constructor gets invoked/called before subclass constructor
        jobPosition = "Not allocated";
    }

    public Employee(String employeeID, String name, String jobPosition) {
        super(name);
        // super keyword refers to base class
        // so super() invokes the base class constructor i.e. super with ()

        this.employeeID = employeeID;
        this.jobPosition = jobPosition;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public int getDdStartedWorking() {
        return ddStartedWorking;
    }

    public void setDdStartedWorking(int ddStartedWorking) {
        this.ddStartedWorking = ddStartedWorking;
    }

    public int getMmStartedWorking() {
        return mmStartedWorking;
    }

    public void setMmStartedWorking(int mmStartedWorking) {
        this.mmStartedWorking = mmStartedWorking;
    }

    public int getYyyyStartedWorking() {
        return yyyyStartedWorking;
    }

    public void setYyyyStartedWorking(int yyyyStartedWorking) {
        this.yyyyStartedWorking = yyyyStartedWorking;
    }

    public String getJobPosition() {
        return jobPosition;
    }

    public void setJobPosition(String jobPosition) {
        this.jobPosition = jobPosition;
    }

    // Employee has not defined its own toString() method
    // but Employee [the subclass] gets an inherited toString() from Person [the super] class

    // as now Employee [th subclass] defines its own toString() method,
    // the own toString() method overrides the Person [the super class] inherited toString() method

//    @Override
//    public String toString() {
//        return "Employee{" +
//                "employeeID='" + employeeID + '\'' +
//                ", ddStartedWorking=" + ddStartedWorking +
//                ", mmStartedWorking=" + mmStartedWorking +
//                ", yyyyStartedWorking=" + yyyyStartedWorking +
//                ", jobPosition='" + jobPosition + '\'' +
//                '}';
//    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeID='" + employeeID + '\'' +
                ", ddStartedWorking=" + ddStartedWorking +
                ", mmStartedWorking=" + mmStartedWorking +
                ", yyyyStartedWorking=" + yyyyStartedWorking +
                ", jobPosition='" + jobPosition + '\'' +
                ", " + super.toString() +
                '}';

        // super.toString() -> Person.toString()
    }

    // there are TWO concepts
    // overloading : two methods with same signature in the same scope i.e. in same class
    // e.g.: void sayHello();
    // e.g.: void sayHello(String message);

    // overriding : no methods in same scope from different owners i.e. base and derived classes
    // e.g.: public String toString(); // from the super class
    // e.g.: public String toString(); // from the sub class [the overriding method]
    // both located in subclass, still subclass toString() gets more preference as it overrides the super class toString()
}
