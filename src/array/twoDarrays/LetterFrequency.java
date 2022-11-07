
/*
*
* Write a JAVA program which will
*   - input a line of text from the user
*   - then will count the frequency of each character and
*   - store the character and its frequency in a 2D array where
*       - first column : represents the character
*       - second column : represents the calculated frequency of the character
*   - then displays the character with its occurrence frequency
*   - also displays the same output again but in decreasing order of occurrence frequency
*
*
* Sample run:
*   input line : welcome to JAVA
*
*   A : 2
*   B : 0
*   C : 1
*   D : 0
*   E : 2
* .
* .
* .
* .
*   Z : 0
*
*   E : 2
*   C : 1
*   L : 1
*   M : 1
*   O : 1
*   W : 1
*   A : 0
*   B : 0
*   D : 0
*   F : 0
*   ....
*   Z : 0
*
* */

package array.twoDarrays;

import array.ArrayMethods;

import java.util.Scanner;

public class LetterFrequency {

    public static void main(String []args){

        // declaration

        String text;

        Scanner input = new Scanner(System.in);

        // input a line of text from the user
        System.out.print("Enter line of text : ");
        text = input.nextLine();

        // store the occurrence of each character in a 2D array
        int [][]alphabetFrequency = new int['z'-'a'+1][2];

        // iterate on each character from the input text
        for( int charCounter = 0 ; charCounter < text.length() ; charCounter++ ){

            // determine the index of the character
            // i.e. for a -> 0
            // i.e. for b -> 1
            // ....
            // i.e. for z -> 25

            if( text.toLowerCase().charAt(charCounter) >= 'a' && text.toLowerCase().charAt(charCounter) <= 'z' ){
                int charIndex = text.toLowerCase().charAt(charCounter) - 'a';

                // increment the counting for that character
                // store the counter in the second column
                alphabetFrequency[charIndex][1]++;
            }

        }

        for( int r = 0 ; r < alphabetFrequency.length ; r++ ){
            // store the character in the first column
            alphabetFrequency[r][0] = r+'A';

            System.out.printf( "%c : %3d\n", alphabetFrequency[r][0], alphabetFrequency[r][1]);
        }
    }

}
