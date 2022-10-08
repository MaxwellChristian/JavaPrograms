
/*
*
Ask users to enter a positive number and convert it into letters as shown in
the following:
For example:
    User enters 125, the program will display IHE
    User enters 0, the program will display J
    User enters 99, the program will display AA
    *
The mapping relationship between numbers and letters is defined as
9876543210 -> ABCDEFGHIJ
*
* */

package practice_questions.classtests.m1;

import java.util.Scanner;

public class Q1 {

    public static void main(String []args){

        String sourcePattern        = "9876543210";
        String destinationPattern   = "ABCDEFGHIJ";

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number : ");
        int num = input.nextInt();

        if( num >= 0 ){

            String inputText;

            // converting the number to string
            inputText = String.valueOf(num);

            // [another approach of] converting the number to string
//            inputText = num + "";

            for(int counter = 0 ; counter < inputText.length() ; counter++){

                System.out.print(destinationPattern.charAt(sourcePattern.indexOf(inputText.charAt(counter))));

            }
        }

    }

}
