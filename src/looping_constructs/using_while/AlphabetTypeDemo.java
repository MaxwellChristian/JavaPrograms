
// Write a JAVA program to identify the type of each alphabet from a given string

package looping_constructs.using_while;

import java.util.DoubleSummaryStatistics;
import java.util.Scanner;

public class AlphabetTypeDemo {

    public static void main(String []args){

        String text;

        // input
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a line of text: ");
        text = input.nextLine();

        // processing

        // check for each character of the text
        // identify the type of character

        // start point
        int counter = 0;
        String outputText = "";

        // check point
        while (counter < text.length()){

            char ch = text.charAt(counter);

            outputText = ch + " : " ;

            if( Character.isLetter(ch) ){
                outputText += " Letter ";
            }

            if( Character.isDigit(ch) ){
                outputText += " Digit ";
            }

            if( Character.isSpaceChar(ch) ){
                outputText += " SpaceChar ";
            }

            if( Character.isUpperCase(ch) ){
                outputText += " Uppercase ";
            }

            if( Character.isLowerCase(ch) ){
                outputText += " Lowercase ";
            }

            // output
            System.out.println(outputText);

            // change point
            counter++;
        }


        // output

    }

}
