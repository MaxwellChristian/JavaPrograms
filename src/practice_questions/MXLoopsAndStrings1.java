/*
*
1.	Take and store two separate lines of input from the user.
1.1.	The first input line can consist of multiple words.
1.2.	The second input line can consist of multiple words.
2.	The program then processes and outputs the following:
2.1.	The first line of output displays
2.1.1.	All words from line1 starting with a VOWEL.
2.1.2.	Each word displayed should have the length of word followed.
2.2.	The second line of output displays
2.2.1.	All the words starting with a consonant.
2.2.2.	Each word displayed should have the count of all consonants in the word.
2.3.	The third line of output displays
2.3.1.	Output of 2.1 in UPPER case
2.3.2.	Output of 2.2 in LOWER case
*
* */

package practice_questions;

import java.util.Scanner;

public class MXLoopsAndStrings1 {

    public static void main(String[] args) {

        // declaration
        String line1;
        String line2;

        int counter;
        int positionOfSpace;
        String wordToProcess;

        String outputLine1 = "";
        String outputLine2 = "";
        String outputLine3 = "";

        Scanner input = new Scanner(System.in);

        // input
        System.out.print("Enter line 1: ");
        line1 = input.nextLine();

        System.out.print("Enter line 2: ");
        line2 = input.nextLine();

        // processing

        // Start: Words starting with vowel-------------------------------------
        // -------------------------------------
        // words starting with vowel from line 1
        positionOfSpace = 0;

        // iterate till the end of the line1
        counter = 0;
        while (counter < line1.length()) {

            // get the index of next space from line1
            positionOfSpace = line1.indexOf(' ', positionOfSpace);

            // if space found then extract the word starting at current position to the index of space
            if (positionOfSpace != -1) {
                wordToProcess = line1.substring(counter, positionOfSpace);

//                System.out.printf("%s %d %d\n", wordToProcess, positionOfSpace, counter);

                counter = ++positionOfSpace;
            } else {
                // if no space exists, take the whole word
                wordToProcess = line1.substring(counter, line1.length());
                counter = line1.length();
            }

            // check the first character for vowel
            // if it is a vowel then append to the output string along with length of the word
            switch (wordToProcess.toUpperCase().charAt(0)) {
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                    outputLine1 += ("(" + wordToProcess + ": " + wordToProcess.length() + ")");
            }

        }

        // output the generated text of words starting with vowel
        System.out.println("From line1, words starting with vowel : " + outputLine1);
        // -------------------------------------
        // End: Words starting with vowel-------------------------------------


        // Start: Words starting with consonant-------------------------------------
        // -------------------------------------

        // words starting with consonant from line 2
        positionOfSpace = 0;

        // iterate till the end of the line2
        counter = 0;
        while (counter < line2.length()) {

            // get the index of next space from line2
            positionOfSpace = line2.indexOf(' ', positionOfSpace);

            // if space found then extract the word starting at current position to the index of space
            if (positionOfSpace != -1) {
                wordToProcess = line2.substring(counter, positionOfSpace);

//                System.out.printf("%s %d %d\n", wordToProcess, positionOfSpace, counter);

                counter = ++positionOfSpace;
            } else {
                // if no space exists, take the whole word
                wordToProcess = line2.substring(counter, line2.length());
                counter = line2.length();
            }

            // check whether first character if an alphabet
            char firstCharacter = wordToProcess.toUpperCase().charAt(0);
            if (Character.isLetter(firstCharacter)) {

                // check the first character for consonant
                // if it is a consonant then append to the output string along with length of the word
                switch (firstCharacter) {
                    case 'A':
                    case 'E':
                    case 'I':
                    case 'O':
                    case 'U':
                        break;
                    default:
                        int totalConsonants = 0;
                        int charCounter = 0;
                        while (charCounter < wordToProcess.length()) {

                            switch (wordToProcess.toUpperCase().charAt(charCounter)) {
                                case 'A':
                                case 'E':
                                case 'I':
                                case 'O':
                                case 'U':
                                    break;
                                default:
                                    totalConsonants++;
                            }

                            charCounter++;
                        }
                        outputLine2 += ("(" + wordToProcess + ": " + totalConsonants + ")");
                }

            }

        }

        // output the generated text of words starting with consonant
        System.out.println("From line2, words starting with consonant : " + outputLine2);

        // -------------------------------------
        // End: Words starting with consonant-------------------------------------


        // Start: Display the required in UPPER and LOWER case-------------------------------------
        // -------------------------------------

        // output the generated text of words starting with vowel [in UPPER case]
        System.out.println("From line1, words starting with vowel : " + outputLine1.toUpperCase());

        // output the generated text of words starting with consonant [in LOWER case]
        System.out.println("From line2, words starting with consonant : " + outputLine2.toLowerCase());

        // -------------------------------------
        // End: Display the required in UPPER and LOWER case-------------------------------------

    }


}
