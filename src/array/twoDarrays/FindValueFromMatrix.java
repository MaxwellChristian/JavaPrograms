package array.twoDarrays;

import array.utilities.ArrayUtilities;

import java.util.Scanner;

public class FindValueFromMatrix {

    public static void main(String[] args) {

        // total rows desired by user
        int totalRows;

        // total cols desired by user
        int totalCols;

        // the value to search from the matrix
        int searchValue;

        // the indices returned by the search method
        int[] foundAtIndices;

        // input line for the user
        Scanner input = new Scanner(System.in);

        // prompt the user to input desired rows
        System.out.print("Enter total rows : ");
        totalRows = input.nextInt();

        // prompt the user to input desired cols
        System.out.print("Enter total cols : ");
        totalCols = input.nextInt();

        // create a matrix of user provided rows and cols
        int[][] matrix = new int[totalRows][totalCols];

        // fill with random values
        ArrayUtilities.fillWithRandomValues(matrix, 20, true);

        // display the matrix
        ArrayUtilities.printValues(matrix);

        // prompt the user to input the value to search
        System.out.print("Enter value to search : ");
        searchValue = input.nextInt();

        // find the maximum value from matrix
        foundAtIndices = ArrayUtilities.search(matrix, searchValue);

        // display the appropriate message as per the result of the search
        if (foundAtIndices[0] != -1) {
            System.out.printf( searchValue + " first found at [%d, %d]\n",
                    foundAtIndices[0],
                    foundAtIndices[1]);
        } else {
            System.out.println(searchValue + " not found");
        }

    }

}
