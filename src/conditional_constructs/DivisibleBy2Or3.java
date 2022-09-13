// Write a program to check whether an input number is divisible by 2 or 3 but not both

package conditional_constructs;

import java.util.Scanner;

public class DivisibleBy2Or3 {

    public static void main(String[] args){

        int number;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        number = input.nextInt();

        if ( number%2==0 ^ number%3==0 ){
            System.out.println( number + " is divisible by 2 or 3");
        }
        else {
            System.out.println( number + " is not divisible by 2 OR 3");
        }

    }

}
