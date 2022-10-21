
/*
*
* input a number from user and
generate random characters of that count.
* Then display the
count of each character in A-Z [case ignored]
*
* A - Z : 65 - 90
* a - z : 97 - 122
*
* 91 - 96 are to be ignored
* less than 65 must be ignored
*
* Sample run
*
* input count : 5
* output
* A M E A M
*
* A : 2
* B : 0
* C : 0
* D : 0
* E : 1
* .
* .
* .
*
* .
* M : 2
* .
* .
* .
* Z : 0
*
*
* */

// input a string
// count occurrence of each character from the string
// and display as
/*
 * * A : 2
 * B : 0
 * C : 0
 * D : 0
 * E : 1
 * .
 * .
 * .
 *
 * .
 * M : 2
 * .
 * .
 * .
 * Z : 0
 * */

package array;

import java.util.Scanner;

public class AlphabetCounterWithMethods {

    public static void main(String[] args) {

        String text;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your desired text: ");
        text = input.nextLine();

        int []count = occurrenceOfCharacters(text);

        // print all the counters for each character from the array
        for (int index = 0; index < count.length ; index++ ) {
            System.out.printf("%c: %2d\n", (index+'A'), count[index]);
        }

    }

    private static int[] occurrenceOfCharacters(String text) {

        int[] count = new int['Z' - 'A' + 1];    // 90-65 : 26 -> so an array of 26 elements

        text = text.toUpperCase();

        int index;
        for (index = 0; index < text.length(); index++) {

            char ch = text.charAt(index);

            if (ch >= 'A' && ch <= 'Z') {
                count[ch - 'A']++;
                // ch : D -> 'D'-'A' -> 68-65 -> 3 the index for 'D'
            }

        }

        return count;
    }

}
