
// Write a program which checks whether a given/input number is divisible by 4 or 5 [but not both]

package conditional_constructs;

import java.util.Scanner;

public class DivisbleBy4OR5 {

    public static void main(String[] args) {

        int num;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number: ");
        num = input.nextInt();

        // OR : is TRUE when ANY condition is CORRECT
        // will check for second condition only when first condition is false
        if (num % 4 == 0 || num % 5 == 0) {
            System.out.println(num + " is divisible by 4 OR 5");
        } else {

            System.out.println(num + " is divisible by ANY 4 and 5");

        }


    }

}
