
/*
* Write a JAVA Program which can display an input number's digits in words
*
* e.g.: input 19
* output : ONE NINE
*
* */

package methods;

import java.util.Scanner;

public class ShowNumberInWords {

    public static void main(String []args){

        // declaration
        int num ;

        // input
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        num = input.nextInt();

        // processing

        // display the digits of a number in words
            // reverse the number
                // first it will invoke/call the method
                // once the method execution is completed, it will store the value returned by the method
                    // stores in the variable on the left of assignment statement

        // separate each digit from the reversed number
        // display the digit in words
        displayNumberInWords(num);

        // output

    }

    private static void showDigitInWords(int digitInMethod) {

        // the value from the calling part is copied to the parameter
        // i.e. digitInMethod = digitFromMain

        switch (digitInMethod){
            case 0:
                System.out.print("Zero");
                break;
            case 1:
                System.out.print("One");
                break;
            case 2:
                System.out.print("Two");
                break;
            case 3:
                System.out.print("Three");
                break;
            case 4:
                System.out.print("Four");
                break;
            case 5:
                System.out.print("Five");
                break;
            case 6:
                System.out.print("Six");
                break;
            case 7:
                System.out.print("Seven");
                break;
            case 8:
                System.out.print("Eight");
                break;
            case 9:
                System.out.print("Nine");
                break;
        }
    }

    private static void displayNumberInWords(int number) {

        // number is 17

        number = reverseNumber(number);
        // number = 71; // the value returned by the method 'reverseNumber'

        while( number > 0 ){

            int dig = number % 10;

            showDigitInWords(dig);

//            switch( dig ){
//                case 0:
//                    System.out.print("Zero");
//                    break;
//                case 1:
//                    System.out.print("One");
//                    break;
//                case 2:
//                    System.out.print("Two");
//                    break;
//                case 3:
//                    System.out.print("Three");
//                    break;
//                case 4:
//                    System.out.print("Four");
//                    break;
//                case 5:
//                    System.out.print("Five");
//                    break;
//                case 6:
//                    System.out.print("Six");
//                    break;
//                case 7:
//                    System.out.print("Seven");
//                    break;
//                case 8:
//                    System.out.print("Eight");
//                    break;
//                case 9:
//                    System.out.print("Nine");
//                    break;
//            }

            number /= 10 ;
        }

    }

    private static int reverseNumber(int num) {

        int rNumber = 0 ;
        while (num > 0 ){

            int dig = num % 10 ;
            rNumber *= 10;
            rNumber+= dig ;

            num /= 10;
        }

        return rNumber;

        // The following is an unreachable statement
        // System.out.print("After return");

    }

}
