
/*
*
Write a JAVA program which takes the input of multiple numbers from the
user and ends when it encounters any negative number.
Then the program displays the count of all single-digit numbers.
The program also displays the smallest number with a single digit.
*
* */

package practice_questions.classtests.m1;

import java.util.Scanner;

public class Q3 {

    public static void main(String []args){

        int number;
        int countOfSingleDigitNumbers = 0;
        int smallestSingleDigitNumber = 9;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter text: ");

        do {
            number = input.nextInt();

            if( number >= 0 && number <= 9 ){

                // System.out.print(number + " ");

                countOfSingleDigitNumbers++;

                if( number < smallestSingleDigitNumber ){
                    smallestSingleDigitNumber = number;
                }
            }

        } while ( number > 0);

        System.out.println();
        System.out.println("Total single digit numbers: " + countOfSingleDigitNumbers);
        System.out.println("Smallest single digit number: " + smallestSingleDigitNumber);
    }

}
