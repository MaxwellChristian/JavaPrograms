
/*
* The purpose of this program is to provide a small demo of coding convention
* */

package elementary;

public class CodingConventionDemo {

    public static void main(String[] args){

        // constants [a value which once assigned cannot be modified]
//                [to declare a constant, prefix the declaration by the keyword final]
        // as a standard coding convention, constants must be all capital
        // - if there are multiple words, join them using underscore

//        double pi = 3.14; // normal variable declaration
        final double PI = 3.14; // declaration as a constant

//        pi = 3.89;  // error: constants cannot be modified

        final double RADIUS_OF_CIRCLE = 2.9;

        // variables
        // all variables must start with a lower case and each next word has first character capital
        double radius;
        double radiusOfCircle;

        double area;
//        double areaofcirlce ; // not as per convention
        double areaOfCircle ; // proper convention



        // classes
        // each class declared must start with first character in UPPER case and then following lower case
        // each word in the class should start with first character un UPPER case

        // e.g. class Test
        // e.g. class TestOfArea

    }

}
