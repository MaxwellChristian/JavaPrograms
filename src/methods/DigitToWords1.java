
/*
*
* Write a JAVA program which can display a given digit in words
* [using methods]
*
* 1 : ONe
* 9 : Nine
*
* */


package methods;

import java.util.Scanner;

public class DigitToWords1 {

    public static void main(String []args){

        int digitFromMain ;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a single digit: ");
        digitFromMain = input.nextInt();

        if( digitFromMain >= 0 && digitFromMain <= 9 ){

            // method execution/invocation/call
                // the method invocation will jump inside the method and return when completed
            showDigitInWords(digitFromMain);

            // any statements here will be executed after the completion of the invoked method
        }
        else {
            System.out.println("Provide a single digit only");
        }
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

}
