
// Write a program which takes input of two numbers from user and print the total of values between the range

// input : two numbers
// processing : take each number in the range and add to total
//                  [start from initial number and repeat till last number]
// output : the computed total value

package looping_constructs.using_while;

import java.util.Scanner;

public class SumOfRangeValues {

    public static void main(String[] args) {

        int num1;
        int num2;
        int total = 0;

        // input
        Scanner input = new Scanner(System.in);

        System.out.print("Enter start value: ");
        num1 = input.nextInt();

        System.out.print("Enter end value: ");
        num2 = input.nextInt();

        // processing

        // start from num1 and move forward till num2

        // start point
        int counter = num1;

        // check point to stop
        while (counter <= num2){

            // add the current value to total
            total += counter;

            // change point to move forward
            counter++;
        }

        // output
        System.out.println("Total of " + num1 + " to " + num2 + " : " + total);

    }

}
