
// Write a JAVA program which takes a string input from user
// Then it displays each character from string in a new line and
// also shows whether the character is in upper or lower case

// sample output
// user string : WelCome#Java
// output:
// W : Upper case
// e : Lower case
// l : Lower case
// C : Upper case
// o : Lower case
// m : Lower case
// e : Lower case
// #
// J : Upper case
// a : Lower case
// v : Lower case
// a : Lower case

package looping_constructs.using_while;

import java.util.Scanner;

public class CharTypeFromString {

    public static void main(String[] args) {

        String text;

        // input
        Scanner input = new Scanner(System.in);

        System.out.print("Enter text: ");
        text = input.next();

        // processing

        // start point
        int counter = 0; // here counter must be zero as string starts at index 0

        // check point
        // we need to take each character from the string i.e. from 0 to length of the string
        while (counter < text.length()) {

            // extract the current character from string
            char ch = text.charAt(counter);

            // check if the extracted character is in UPPER or LOWER case
            if (ch >= 'A' && ch <= 'Z') {
                System.out.println(ch + " : Upper case");
            } else {
                if (ch >= 'a' && ch <= 'z') {
                    System.out.println(ch + " : Lower case");
                } else {
                    System.out.println(ch);
                }
            }

            // change point
            counter++;
        }

        // output

    }

}
