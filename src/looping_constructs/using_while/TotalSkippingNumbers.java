
// Write a JAVA program which can compute
// total of values in a given range skipping multiples of 5

// i.e. add all values between N1 and N2 skipping multiples of 5

package looping_constructs.using_while;

import java.util.Scanner;

public class TotalSkippingNumbers {

    public static void main(String[] args) {

        int num1;
        int num2;
        int total = 0;

        // input
        Scanner input = new Scanner(System.in);

        System.out.print("Enter num1: ");
        num1 = input.nextInt();

        System.out.print("Enter num2: ");
        num2 = input.nextInt();

        // processing

        // start point
        int counter = num1;

        // check point
        while (counter <= num2) {

            // add to total skipping multiple of 5
            if( counter%5 != 0 ){

                System.out.printf("%2d + %2d = ", total, counter);

                total += counter;

                // output
                System.out.printf("%3d\n", total);
            }

            // change point
            counter++;
        }

    }

}
