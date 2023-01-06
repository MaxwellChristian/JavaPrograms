
// A demo of the runtime exception which may be generated
// when the user inputs the divisor as ZERO
// So the program checks for the divisor using an IF statement

package exception_handling;

import java.util.Scanner;

public class DivisionDemoUsingIF {

    public static void main(String []args){

        Scanner input = new Scanner(System.in);

        // Prompt the user to enter two integers
        System.out.print("Enter integer 1: ");
        int number1 = input.nextInt();

        System.out.print("Enter integer 2: ");
        int number2 = input.nextInt();

        if (number2 != 0)
            System.out.println(number1 + " / " + number2 + " is " +
                    (number1 / number2));
        else
            System.out.println("Divisor cannot be zero ");

    }

}
