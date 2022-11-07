
/*
* Write a JAVA program which can input multiple numbers as per user choice and
* then let the user input that many number.
* Then the program displays all input numbers as per the sample run
*
* Sample run:
*
* How many numbers you want to enter : 7
*
* Enter number 1 : 1
* Enter number 2 : 98
* Enter number 3 : 79
* Enter number 4 : 8
* Enter number 5 : 21
* Enter number 6 : 9
* Enter number 7 : 99
*
* Output:
*   1 E 79 E 21 9 99
*   O 98 O 8 O O O
* */

package array;

import java.util.Scanner;

public class Test1 {

    public static void main(String []args) {

        // declaration section
        int totalValuesToInput;
        int number;

        String[] evenValues;
        String[] oddValues;

        // input
        Scanner input = new Scanner(System.in);

        System.out.print("How many numbers you want to enter : ");
        totalValuesToInput = input.nextInt();

        evenValues = new String[totalValuesToInput];
        oddValues = new String[totalValuesToInput];

        // processing
        int counter;

        for (counter = 0; counter < totalValuesToInput; counter++) {
            System.out.printf("Enter number %d : ", counter + 1);
            number = input.nextInt();

            if (number % 2 == 0) {
                evenValues[counter] = "" + number;
                oddValues[counter] = "E";
            } else {
                evenValues[counter] = "O";
                oddValues[counter] = "" + number;
            }
        }

        // display even values
        for (counter = 0; counter < totalValuesToInput; counter++) {
            System.out.print(evenValues[counter] + " ");
        }
        System.out.println();

        // display odd values
        for (counter = 0; counter < totalValuesToInput; counter++) {
            System.out.print(oddValues[counter] + " ");
        }

        // output

    }

}
