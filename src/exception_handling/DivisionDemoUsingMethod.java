
// A demo of the runtime exception which may be generated
// when the user inputs the divisor as ZERO
// The division is performed using a method
// So the program checks for the divisor using an IF statement

// the method exits the program in case the divisor is ZERO
// Note: If the exit statement is commented,
// the calling method will never come to know what went wrong in the called method

package exception_handling;

import java.util.Scanner;

public class DivisionDemoUsingMethod {

    public static void main(String []args){

        Scanner input = new Scanner(System.in);

        // Prompt the user to enter two integers
        System.out.print("Enter integer 1: ");
        int number1 = input.nextInt();

        System.out.print("Enter integer 2: ");
        int number2 = input.nextInt();

        int result = divide(number1, number2);
        System.out.println(number1 + " / " + number2 + " is "
                + result);

    }

    private static int divide(int number1, int number2) {
        if (number2 == 0) {
            System.out.println("Divisor cannot be zero");

            // the following statement will make the entire program terminate
            // so no more statements will be executed from
            // the calling method and remaining program
            System.exit(1);
        }

        return number1 / number2;
    }

}
