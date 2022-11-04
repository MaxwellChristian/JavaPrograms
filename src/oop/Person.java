
/*
*
* class Person
*   has 8 member variables
*       name, date, month, year, weight, height, gender, address
*
*   has 16 member methods/functions [2 for each member variable]
*       setXXX()    : set the value for corresponding member variable
*       getXXX()    : gets the value for corresponding member variable
*
* */

package oop;

public class Person {

    // name
    private String name;

    // date of birth
    private int dateOfBirth;
    private int monthOfBirth;
    private int yearOfBirth;

    // weight
    private float weight;

    // height
    private float height;

    // gender
    private int gender;

    // address
    private String address;

    public Person() {
    }

    public Person(String name, int dateOfBirth, int monthOfBirth, int yearOfBirth, float weight, float height, int gender, String address) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.monthOfBirth = monthOfBirth;
        this.yearOfBirth = yearOfBirth;
        this.weight = weight;
        this.height = height;
        this.gender = gender;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public int getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(int dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getMonthOfBirth() {
        return monthOfBirth;
    }

    public void setMonthOfBirth(int monthOfBirth) {
        this.monthOfBirth = monthOfBirth;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    /*
    public String getName() {
        return this.name;
        // returns the member variable 'name'
    }
*/

//    public void setName(String name1) {
//        name = name1;
//    }

    /*
    public void setName(String name) {
        // expected is left variable [i.e. member variable] is assigned the value of right variable [i.e. parameter variable]
        // so to differentiate the member variable 'this' keyword is used
        // name = name;

        this.name = name;
    }
    */


}
