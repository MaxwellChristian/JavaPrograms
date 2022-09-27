
// Write a program from user which performs the following
//      take input of two numbers from user [in a single line]
//      checks whether second number is a factor of first or not
//      then takes the choice of user to do it again with new values
//      if user replies 'Y' then program works
//      if user replies 'N' then program terminates

package looping_constructs.using_do_while;

import java.util.Scanner;

public class UserChoice1 {

    public static void main(String[] args) {

        int num1;
        int num2;

        char choice;

        // input
        Scanner input = new Scanner(System.in);

        // here we use do - while loop
        // because it is an exit - controller loop
        // i.e. it executes the body of the loop and then checks the condition to exit or not

        // do - while loop usually executes at least once

        // so a do - while loop does not have a start point
        do {
            System.out.print("Enter two numbers [separated by space]: ");
            num1 = input.nextInt();
            num2 = input.nextInt();

            // processing

            // check if second number is a factor of first number
            if (num1 % num2 == 0) {

                // output
                System.out.println(num2 + " is a factor of " + num1);
            }

            System.out.print("Wish to continue [Y/N]: ");
            choice = input.next().charAt(0);
        } while (choice == 'Y');
        // check point
        // the ; at the end of while statement is a part of the syntax

    }

}
