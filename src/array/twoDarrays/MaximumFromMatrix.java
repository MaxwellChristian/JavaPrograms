
/*
*
* Write a JAVA program which
*   creates a dynamic matrix as per user choice
*   fill the matrix with random values
*   displays the matrix
*   display the maximum value from the matrix
*
* */

package array.twoDarrays;

import array.utilities.ArrayUtilities;
import java.util.Scanner;

public class MaximumFromMatrix {

    public static void main(String []args){

        // declaration section

        // total rows desired by user
        int totalRows;
        // total cols desired by user
        int totalCols;

        // input line for the user
        Scanner input = new Scanner(System.in);

        // prompt the user to input desired rows
        System.out.print("Enter total rows : ");
        totalRows = input.nextInt();

        // prompt the user to input desired cols
        System.out.print("Enter total cols : ");
        totalCols = input.nextInt();

        // create a matrix of user provided rows and cols
        int [][]matrix = new int[totalRows][totalCols];

        // fill with random values
        ArrayUtilities.fillWithRandomValues(matrix, 20, true);

        // display the matrix
        ArrayUtilities.printValues(matrix);

        // find the maximum value from matrix
        int maxValueInMatrix = ArrayUtilities.findMaximum(matrix);

        // display the maximum values found from matrix
        System.out.println("Max value in matrix : " + maxValueInMatrix);
    }



}
