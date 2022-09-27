
// Write a JAVA program which takes two inputs from user.
// The first input must be smaller than the second input.
// Then the program will display each number [as EVEN or ODD] between the given range

// Sample output:
// first input : 7
// second input : 12

// output
// 7 : odd
// 8 : even
// 9 : odd
// 10 : even
// 11 : odd
// 12 : even

package looping_constructs.using_while;

import java.util.Scanner;

public class EvenOddNumbersInRange {

    public static void main(String[] args){

        int startValue;
        int endValue ;

        // input
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the start number: ");
        startValue = input.nextInt();

        System.out.print("Enter the end number: ");
        endValue = input.nextInt();

        // processing

        // check whether the fist input is smaller than the second or not
        if ( startValue <= endValue ) {

            // display each number [as EVEN or ODD] between range

            // start point
            int counter = startValue;

            // check point
            while (counter <= endValue){

                // System.out.println(counter);

                // check if the current value [i.e. counter] is EVEN or ODD
                if( counter%2 == 0 ){
                    System.out.println(counter + " : EVEN");
                }
                else {
                    System.out.println(counter + " : ODD");
                }

                // change point
                counter++;
            }

        }
        else {
            System.out.println("First value must be less than second value");
        }

        // output

    }

}
