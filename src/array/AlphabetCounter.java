
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

public class AlphabetCounter {

    public static void main(String[] args) {

        String text;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your desired text: ");
        text = input.nextLine();

        // processing

        // extract each character and increment its count
        // so here we required counters for A to Z i.e. in total 25 counters

        // when ever you need to store multiple values of same type
        // arrays are more useful

        // arrays are collection of values of same data type
        // starts at index 0

        // declaring arrays
//        int []count;    // declares an empty array
//        int []count2 = new int[10]; // declares an array which can hold 10 integers
//        double count3[] = {5.7, 10.2, 11}; // declares an array which is holding 3 double values

        // int []count = new int[25];   // creates an array of size 25
        // size must always be a positive integer
        // so the array ranges from count[0] to count[24] making a total of 25 elements

        // so you can access indices only from 0 to 24
        // accessing any index out of this range will generate an exception ArrayIndexOutOfBoundsException

        int[] count = new int['Z' - 'A' + 1];    // 90-65 : 26 -> so an array of 26 elements

        // System.out.println("Total elements in array: " + count.length);
        // focus that the 'length' with an array is a variable and not a method

        int index;
        for (index = 0; index < text.length(); index++) {

            char ch = text.toLowerCase().charAt(index);

            if (ch >= 'a' && ch <= 'z') {
                count[ch - 'a']++;
                // ch : a -> 'a'-'a' -> 65-65 -> 0 the index for 'a'
            }

        }

        // print all the counters for each character from the array
        for (index = 0; index < count.length; index++) {
            System.out.printf("%c: %2d\n", (index + 'A'), count[index]);
        }

    }

}
