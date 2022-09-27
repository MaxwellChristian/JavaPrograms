
// Write a program which can
// take a number input from user
// then will print whether the input number is prime or not

// sample output

// input number : 7
// output : 7 is PRIME number

// input number : 18
// output : 18 is NOT PRIME number

// hint : if number has factors [other than 1 and number itself],
// then number is not PRIME

package looping_constructs.using_while;

import java.util.Scanner;

public class PrimeNumberCheck {

    public static void main(String[] args){

        int numberToCheck;

        // input
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number to check: ");
        numberToCheck = input.nextInt();

        // processing

        // find the factors of the number [other than 1 and number itself]

        boolean foundAFactor = false;

        // start point
        int counter = 2;

        // check point

        // move forward upto the number [not inclusive of the number]
        // so we will use < not <=

        // for example if number is 7, we start from 2 upto 6 [not 7]
        while (counter < numberToCheck){

            // check whether the counter is a factor of the number
            // if counter divides the number then it is a factor
            // i.e. if remainder of number is ZERO when divide by the counter
            if( numberToCheck%counter == 0 ){
                System.out.println(numberToCheck + " is NOT PRIME number : " + counter);

                // mark that a factor is found
                foundAFactor = true;
            }

            // change point
            counter++;
        }

        // output
//        if( foundAFactor == false ){
        if( ! foundAFactor ){
            System.out.println(numberToCheck + " is a PRIME number");
        }


    }

}
