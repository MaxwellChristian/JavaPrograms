
/*
*
* Write a JAVA program which
*   - generates a 2D array i.e. matrix as per user choice of row and col
*   - fills the generated 2D array with random values
*   - sorts the 2D array
*   - displays the original values and the sorted values
*
* */


package array.twoDarrays;

import array.ArrayMethods;

public class SortMatrix {

    public static void main(String []args){

        int [][]matrix = {
                {19, 29, 1, 57, 8},
                {7, 189, 21, 7, 9},
                {9, 9, 1, 1, 2}
        };


        System.out.println("Before sort");
        ArrayMethods.printValues(matrix, 3, ' ');
        System.out.println();

        ArrayMethods.sortMatrix(matrix);

        System.out.println("After sort");
        ArrayMethods.printValues(matrix, 3, ' ');
        System.out.println();

    }

}
