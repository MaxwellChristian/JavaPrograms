
// Develop a program which can compute the radius of a circle
// take into consideration that radius should not be negative

// what we learn
// - use of arithmetic operators
// - use of data type
// - use of variable
// - use of conditional construct [ if - else ]
// - use of relational operators
    // > : greater than
    // < : less than
    // == : comparison [equality check]
    // != : not equals
    // >= : greater than or equal to
    // <= : less than or equal to

package conditional_constructs;

import java.util.Scanner;

public class RadiusOfCircle {

    public static void main(String[] args){

//        declaration section
        double radius;
        double pi = 3.14;
        double area;

//        input section
        Scanner input = new Scanner(System.in);

        System.out.println("Enter radius: ");
        radius = input.nextDouble();

//        processing section

//        check whether radius is positive or not
        if( radius >= 0 ){
            area = pi * radius * radius;

//        output section
            System.out.println("Area of circle with radius " + radius + " is " + area);
        }
        else {
            System.out.println("Please provide radius more than ZERO");
        }

    }

}
