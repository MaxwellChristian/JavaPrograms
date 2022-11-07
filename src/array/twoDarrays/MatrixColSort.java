
/*
*
* Write a JAVA program which will
*   - generate a matrix of 3x5 with random int values
*   - sort each col of the matrix in ascending order
*
* then display the matrix in following format
*   |  3  7  9 11 19 |
*   |  1  9 17 19 21 |
*   | 19 28 29 35 41 |
*
* */

package array.twoDarrays;

import array.ArrayMethods;

public class MatrixColSort {

    private static final int TOTAL_ROWS = 3;
    private static final int TOTAL_COLS = 5;

    public static void main(String []args){

        // declare the matrix of 3 rows and 5 columns
        int [][]matrix = new int[TOTAL_ROWS][TOTAL_COLS];

        int row;

        // generate random values for each row
        for( row = 0 ; row < TOTAL_ROWS ; row++ ){
            matrix[row] = ArrayMethods.getRandomIntValues(TOTAL_COLS, 100);
        }

        // display the matrix [before sort]
        System.out.println("Before sort");
        ArrayMethods.printValues(matrix, 3, ' ');

        ArrayMethods.sort(ArrayMethods.BUBBLE_SORT, ArrayMethods.ASCENDING, ArrayMethods.COL_SORT, matrix);

        System.out.println("After sort");
        // display the matrix [after sort]
        ArrayMethods.printValues(matrix, 3, ' ');
    }

}
