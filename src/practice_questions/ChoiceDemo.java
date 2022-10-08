package practice_questions;
/*
*
* Write a JAVA program which shows a menu option to the user and
* performs the actions according to the choice of the user.
    * Choice options displayed are
1. convert an int value to binary and display the same
2. reverse a string using for loop
3. Input the number of students and then read name and score for that each student.
        After all inputs display the name of the student with the highest score
4. Convert a hex string to binary [in octets i.e. space after each 8 bits]
5. Enter a 9 digit SIN number and print in the provided format [e.g 123123456 : 123-12-3456]
*
* Do not exit the program till the user enters [0]
*
* */

import java.util.Scanner;

public class ChoiceDemo {

    public static void main(String[] args) {

        // declaration
        int MAX_DIGITS_IN_SIN_NUMBER = 9;

        int userChoice;
        do {

            // first show the menu options
            System.out.println("1. Integer to Binary");
            System.out.println("2. Reverse of the string");
            System.out.println("3. Student with maximum score");
            System.out.println("4. Hex to Binary");
            System.out.println("5. Formatted SIN number");
            System.out.println("0. Exit");

            // then take the choice of use from the menu
            System.out.print("Enter your choice: ");
            Scanner input = new Scanner(System.in);

            // input
            userChoice = input.nextInt();

            // processing

            // perform the selected option
            // if the option is to exit then terminate the program
            // else continue to show the options again and wait for user input

            switch (userChoice) {
                case 1:
                    // int to binary

                    System.out.print("Enter int number: ");
                    int number = input.nextInt();

                    System.out.println(number + " : " + Integer.toBinaryString(number));

                    break;
                case 2:
                    // reverse a string

                    System.out.print("Enter text: ");
                    String text = input.next();

                    int counter;
                    String reverseString = "";
                    for (counter = text.length() - 1; counter >= 0; counter--) {
                        reverseString += ("" + text.charAt(counter));
                    }

                    System.out.println(text + " : " + reverseString);

                    break;
                case 3:
                    // max score by a student

                    System.out.println("enter number of students: ");
                    int totalStudents = input.nextInt();

                    String studentName = null;
                    String maxScoringStudent = null;
                    for (counter = 0; counter < totalStudents; counter++) {

                        System.out.print("Enter student name " + counter + " : ");
                        studentName = input.next();

                        System.out.print("Enter student score " + counter + " : ");
                        int studentScore = input.nextInt();

                        int maxScore = 0;
                        if (maxScore < studentScore) {
                            maxScore = studentScore;
                            maxScoringStudent = studentName;
                        }

                    }

                    System.out.println("Max scoring Student: " + maxScoringStudent);

                    break;
                case 4:
                    // hex to binary

                    System.out.print("Enter hex string: ");
                    String hexString = input.next();

                    int intNumber = Integer.parseInt(hexString, 16);
                    String binaryString = Integer.toBinaryString(intNumber);

                    // check if the generated binary string has length in multiple of 8 [octets]
                    // if not that prefix with ZEROs

                    if (binaryString.length() % 8 != 0) {
                        // prefix with ZEROs
                        for (; binaryString.length() % 8 != 0; binaryString = "0" + binaryString) ;
                    }

                    // insert spaces after each octet [i.e. after every 8 bits]
                    String octetBinaryString = "";
                    for (counter = 0; counter < binaryString.length(); counter++) {
                        if (counter % 8 == 0) {
                            octetBinaryString += " ";
                        }
                        octetBinaryString += binaryString.charAt(counter);
                    }

                    System.out.println(hexString + " : " + octetBinaryString);

                    break;
                case 5:
                    // formatted sin number

                    System.out.print("Enter SIN number: ");
                    String sinNumber = input.next();

                    if (sinNumber.length() != MAX_DIGITS_IN_SIN_NUMBER) {
                        System.out.println("SIN number must be of " + MAX_DIGITS_IN_SIN_NUMBER + " digits");
                    } else {
                        String formatterSinNumber = sinNumber.substring(0, 3)
                                + "-" + sinNumber.substring(3, 5)
                                + "-" + sinNumber.substring(5);
                        System.out.println("SIN number: " + formatterSinNumber);
                    }


                    break;
                case 0:
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }

            // output

        } while (userChoice != 0);

    }

}
