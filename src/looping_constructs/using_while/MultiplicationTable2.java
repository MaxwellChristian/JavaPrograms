
// Write a JAVA program which will print the multiplication table
// of a desired number till a given range
// the computed value must have two decimals

// sample output

// number : 5 [can also be a double value]
// range : 7

// output
// 5 x 1 = 5.00
// 5 x 2 = 10.00
// 5 x 3 = 15.00
// 5 x 4 = 20.00
// 5 x 5 = 25.00
// 5 x 6 = 30.00
// 5 x 7 = 35.00

package looping_constructs.using_while;

import java.util.Scanner;

public class MultiplicationTable2 {

    public static void main(String[] args){

        double number;
        int range;
        double ans;

        // input
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number: ");
        number = input.nextDouble();

        System.out.print("Enter range: ");
        range = input.nextInt();

        // processing

        // start from 1 upto range
        // compute the multiplication value and print

        // start point
        int counter = 1;

        // check point
        while (counter <= range){

            ans = number * counter;

            // output
//            System.out.println(number + " x " + counter + " = " + ans);

            // use printf for formatted output
            //      the first argument is a string with format specifiers [%c %d %f %s]
            //          %c : character
            //          %d : decimal [int]
            //          %f : float [with decimal values]
            //          %s : string
            //      then there can be other parameters specifying the values to display
//            System.out.printf("%f x %d = %f\n", number, counter, ans);

            // specify width also
            // System.out.printf("%f x %3d = %12f\n", number, counter, ans);

            // specify width with precision
            // System.out.printf("%f x %3d = %12.2f\n", number, counter, ans);

            // specify width, precision and leading zeroes
            System.out.printf("%f x %3d = %012.2f\n", number, counter, ans);

            // change point
            counter++;
        }

    }

}
