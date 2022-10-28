
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

    public static void main(String []args){

        // declare the matrix of 3 rows and 5 columns
        int [][]matrix = new int[3][5];

        int row;
        int col ;

        // generate random values for each row
        for( row = 0 ; row < 3 ; row++ ){
            matrix[row] = ArrayMethods.getRandomIntValues(5, 100);
        }

        // display the matrix [before sort]
        System.out.println("Before sort");
        ArrayMethods.printArray(matrix);

        ArrayMethods.sort(ArrayMethods.BUBBLE_SORT, ArrayMethods.ASCENDING, ArrayMethods.COL_SORT, matrix);

        System.out.println("After sort");
        // display the matrix [after sort]
        ArrayMethods.printArray(matrix);
    }

}
