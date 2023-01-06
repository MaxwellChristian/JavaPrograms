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
        catch (ArithmeticException ex) {
            // for handling any arithmetic exception
            System.out.println("Exception: an integer " +
                    "cannot be divided by zero ");
        }
        catch (InputMismatchException ex){
            // handling any exception related to input mismatch
            System.out.println("Provide only integer");
        }
        catch (Exception ex){
            // handling all other un-caught exceptions
            // [But this catch must always be at last
            System.out.println(ex.getMessage());
        }
        finally {
            System.out.println("In finally");
        }

        System.out.println("Execution continues ...");
    }

    public static int divide(int number1, int number2) {
        if (number2 == 0)
            throw new ArithmeticException("Divisor cannot be zero");

        return number1 / number2;
    }

}
