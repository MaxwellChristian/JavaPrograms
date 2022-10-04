
/*
 * Write a JAVA program which inputs multiple numbers from user [until encounters -1]
 * Then it displays
 *   total numbers input
 *   total prime numbers
 *   the last prime number input
 * */

package looping_constructs.using_do_while;

import java.util.Scanner;

public class MultipleInputs {

    public static void main(String[] args) {

        // declaration
        int number;
        int totalInputNumbers = 0;
        int totalPrimeNumbers = 0;
        int lastPrimeNumber = 0;

        // input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter numbers: ");

        // processing

        // variable to check whether the number has factor or not
        int factor;

        // boolean variable to mark whether number is prime or not
        // true     : indicates prime
        // false    : indicated non - prime
        boolean isPrime = false;

        do {

            // input a number
            number = input.nextInt();

            // count the total permitted input numbers
            totalInputNumbers++;

            // check for prime number
            isPrime = true;
            // iterate upto number to find factors
            for (factor = 2; factor < number; factor++) {

                // if found a factor,
                    // then mark the number to be non-prime
                    // and break the iterations
                if (number % factor == 0) {
                    isPrime = false;
                    break;
                }
            }

            // check after all iterations whether the number is prime or not
                // the isPrime must be FALSE
                // also check whether the looped iterated or not
                    // [i.e. in case of -1, the exit number]
            if (isPrime && factor <= number) {
//                System.out.println(number + " is prime");

                // increment the count of total prime numbers
                totalPrimeNumbers++;

                // mark the current number as the last prime number in the list
                lastPrimeNumber = number;
            }

        } while (number != -1);

        System.out.println("Total numbers : " + --totalInputNumbers);

        if( totalPrimeNumbers > 0 ){
            System.out.println("Total prime numbers : " + totalPrimeNumbers);
            System.out.println("Last prime number : " + lastPrimeNumber);
        }
        else {
            System.out.println("No prime numbers in the list");
        }

    }

}
