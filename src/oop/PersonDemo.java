
/*
*
* Write a program which will
*   - demonstrate the input and display of basic details of any person
*   - details may include
*       - name
*       - dob
*       - height
*       - address
*       - gender
*       - weight
*
* */

package oop;

import java.util.Random;

public class PersonDemo {

    public static void main(String []args){

        // create an object/instance of Person

        Person p1;  // reference to an upcoming instance/object of Person class
        p1 = new Person();  // referring to a new object/instance using p1

        Person p2 = new Person(); // combination of declaration and assignment

        // assigning values to members of Person object
        // p1.name = "Maxwell"; // not suggested. So the 'name' member should not be accessible here
//        p1.setName("Maxwell"); // suggested way to work

        // System.out.println("Name: " + p1.name);  // not suggested [if 'name' member is not accessible, this will not work]
        // System.out.println("Name : " + p1.getName()); // suggested way to work

        p1.setName("Maxwell");
        p1.setAddress("Regina, Canada");

        System.out.println("P1 : Name: " + p1.getName());
        System.out.println("P1 : Address: " + p1.getAddress());

        Person p3 = new Person();
        p3.setName("Student3");
        p3.setAddress("Calgary, Canada");

        System.out.println("P3 : Name: " + p3.getName());
        System.out.println("P3 : Address: " + p3.getAddress());

        System.out.println("P2 : Name: " + p2.getName());
        System.out.println("P2 : Address: " + p2.getAddress());

        Person p4 = new Person("Student4", 01, 10, 1990, 78, 6.2F, 0, "Edmonton, Canada");
        System.out.println("P4 : Name: " + p4.getName());
        System.out.println("P4 : Address: " + p4.getAddress());


    }

}
