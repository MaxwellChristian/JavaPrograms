package io_file_handling;

import java.io.Serializable;
import java.util.Arrays;

// Implementing the 'Serializable' with a class, can convert the object contents to bytes and vice-versa
public class Student implements Serializable {

    String enrolmentNumber;
    String firstName;
    String middleName;
    String lastName;

    String []hobbies;

    // members defined as 'transient' are not serialized
    transient String []nickNames;

    public Student() {
    }

    public Student(String enrolmentNumber, String firstName, String middleName, String lastName) {
        this.enrolmentNumber = enrolmentNumber;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
    }

    public Student(String enrolmentNumber, String firstName, String middleName, String lastName, String[] hobbies) {
        this.enrolmentNumber = enrolmentNumber;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.hobbies = hobbies;
    }

    public String getEnrolmentNumber() {
        return enrolmentNumber;
    }

    public void setEnrolmentNumber(String enrolmentNumber) {
        this.enrolmentNumber = enrolmentNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String[] getHobbies() {
        return hobbies;
    }

    public void setHobbies(String[] hobbies) {
        this.hobbies = hobbies;
    }

    public String[] getNickNames() {
        return nickNames;
    }

    public void setNickNames(String[] nickNames) {
        this.nickNames = nickNames;
    }

    @Override
    public String toString() {
        return "Student{" +
                "enrolmentNumber='" + enrolmentNumber + '\'' +
                ", firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", hobbies=" + Arrays.toString(hobbies) +
                ", nickNames=" + Arrays.toString(nickNames) +
                '}';
    }
}
