package exception_handling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisionDemo2CheckedUsingException {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {

            // Prompt the user to enter two integers
            System.out.print("Enter integer 1: ");
            int number1 = input.nextInt();

            System.out.print("Enter integer 2: ");
            int number2 = input.nextInt();

            int result = divide(number1, number2);
            System.out.println(number1 + " / " + number2 + " is "
                    + result);

        }
        // a try can have multiple catch clauses
        // but each catch can be associated only with ONE try
        catch (ArithmeticException ex) {
            // for handling any arithmetic exception
            System.out.println("Exception: an integer " +
                    "cannot be divided by zero ");
        }
        catch (InputMismatchException ex){
            // handling any exception related to input mismatch
            System.out.println("Provide only integer");
        }
        // the following catch with Exception class must be at last
        catch (Exception ex){
            // handling all other un-caught exceptions
            // [But this catch must always be at last]
            System.out.println(ex.getMessage());
        }
        finally {
            // the 'finally' block is always executed.
            // i.e. whether exception occurs or not, finally is always executed
            System.out.println("In finally");
        }

        // the following statement will be executed [whether exception occurs or not]
        System.out.println("Execution continues ...");
    }

    public static int divide(int number1, int number2) {
        if (number2 == 0) {
            throw new ArithmeticException("Divisor cannot be zero");
            // the 'throw' keyword is used to throw back the exception to the calling method
        }

        return number1 / number2;
    }

}
