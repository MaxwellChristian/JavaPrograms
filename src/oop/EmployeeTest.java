package oop;

public class EmployeeTest {

    public static void main(String[] args){

        Employee e1 = new Employee();

        // we can access all the members that Employee class has declared

        // set the name of the employees
        e1.setName("Maxwell");
        e1.setAddress("Regina, Canada");
        e1.setJobPosition("Instructor");

        System.out.println(e1.getName());
        System.out.println(e1.getAddress());
        System.out.println(e1.getJobPosition());

        Employee e2 = new Employee("17", "Alex", "Instructor");
        System.out.println("Employee E2");
        System.out.println(e2);
        System.out.println(e2.getName());
        System.out.println(e2.getAddress());
    }

}
