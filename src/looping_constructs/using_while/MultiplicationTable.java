
// Write a JAVA program which will print the multiplication table
// of a desired number till a given range

// sample output

// number : 5
// range : 7

// output
// 5 x 1 = 5
// 5 x 2 = 10
// 5 x 3 = 15
// 5 x 4 = 20
// 5 x 5 = 25
// 5 x 6 = 30
// 5 x 7 = 35

package looping_constructs.using_while;

import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args){

        int number;
        int range;
        int ans;

        // input
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number: ");
        number = input.nextInt();

        System.out.print("Enter range: ");
        range = input.nextInt();

        // processing

        // start from 1 upto range
        // compute the multiplication value and print

        // start point
        int counter = 1;

        // check point
        while (counter <= range){

            ans = number * counter;

            // output
            System.out.println(number + " x " + counter + " = " + ans);

            // change point
            counter++;
        }

    }

}
