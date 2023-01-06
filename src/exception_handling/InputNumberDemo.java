package exception_handling;

// Input a number from the user and display the square of that number
// Take a choice from the user to continue with other input
// continue to take input and repeat the process

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputNumberDemo {

    public static void main(String[] args) {

        int number;
        int toContinue = 0;
        Scanner input = new Scanner(System.in);

        do {

            try {

                System.out.print("Enter number: ");
                number = input.nextInt();

                System.out.println(number + " : " + (number * number));

                System.out.print("Continue [Y:1/N:0]: ");
                toContinue = input.nextInt();

            } catch (InputMismatchException ex) {
                System.out.println("Incorrect input");
                input.nextLine();   // discard the incorrect input from input buffer
            }

        } while (toContinue == 1);


    }

}
