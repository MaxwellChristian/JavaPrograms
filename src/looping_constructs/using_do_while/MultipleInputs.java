
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

    public static void main(String []args){

        int number;
        int totalInput;
        int totalPrimeNumbers;
        int lastPrimeNumber;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter numbers: ");

        do {

            number = input.nextInt();
            System.out.println(number);

            // check for prime number
            int factor;
            boolean isPrime = true;
            for(factor = 2 ; factor < number ; factor++ ){
                if( number%factor == 0 ){
                    isPrime = false;
                    break;
                }
            }

            if( isPrime ){
                System.out.println( number + " is prime");
            }

        } while (number != -1);

        System.out.println("After loop");
    }

}
