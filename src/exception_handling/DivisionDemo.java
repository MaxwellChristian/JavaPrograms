package exception_handling;

// A demo of the runtime exception which may be generated
// when the user inputs the divisor [number 2] as ZERO

import java.util.Scanner;

public class DivisionDemo {

    public static void main(String []args){

        Scanner input = new Scanner(System.in);

        // Prompt the user to enter two integers
        System.out.print("Enter integer 1: ");
        int number1 = input.nextInt();

        System.out.print("Enter integer 2: ");
        int number2 = input.nextInt();

        System.out.println(number1 + " / " + number2 + " is " +
                (number1 / number2));

    }

}
