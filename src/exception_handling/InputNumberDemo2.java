package exception_handling;

// Input a number from the user and display the square of that number
// Take a choice from the user to continue with other input
// continue to take input and repeat the process

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputNumberDemo2 {

    public static void main(String[] args) {

        int number;
        int toContinue = 0;
        Scanner input = new Scanner(System.in);

        do {

            try {

                int result = getSquare();
                System.out.println("Result: " + result);

                System.out.print("Continue [Y:1/N:0]: ");
                toContinue = input.nextInt();

            } catch (InputMismatchException ex) {
                System.out.println("[In Main] Incorrect input");
                input.nextLine();   // discard the incorrect input from input buffer
            }

        } while (toContinue == 1);


    }
    private static int getSquare() {

        Scanner input = new Scanner(System.in);

        try {
            System.out.print("Enter number: ");
            int number = input.nextInt();

            return number*number;
        }
        catch (Exception ex){
            System.out.println("[In getSquare] Incorrect input");

            // the handled exception needs to be reported back to the calling function
            // so, we need to throw the exception back to the calling function
            throw ex;
        }

    }

}
