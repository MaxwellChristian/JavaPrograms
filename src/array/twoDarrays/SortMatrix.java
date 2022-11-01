
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

import java.util.Random;
import java.util.Scanner;

public class SortMatrix {

    public static void main(String []args){

        // declaration section

        // total rows desired by user
        int totalRows;
        // total cols desired by user
        int totalCols;

        // input line for the user
        Scanner input = new Scanner(System.in);

        // prompt the user to input desired rows
        System.out.print("Enter rows: ");
        totalRows = input.nextInt();

        // prompt the user to input desired cols
        System.out.print("Enter cols: ");
        totalCols = input.nextInt();

        // create a matrix of user provided rows and cols
        int [][]matrix = new int[totalRows][totalCols];

        // fill the matrix with random values
        fillWithRandomValues(matrix, 20);

        // display the matrix
        printValues(matrix);
        System.out.println();

        // sort the matrix
        sortMatrix(matrix);

        // display the matrix
        printValues(matrix);

    }

    private static void sortMatrix(int[][] matrix) {
        // copy all values from matrix to 1D array
        int []values = new int[matrix.length*matrix[0].length];
        copyValues(matrix, values);

        // sort the 1D array
        sortValues(values);

        // copy values from 1D array back to matrix
        copyValues(values, matrix);
    }

    private static void copyValues(int[] values, int[][] matrix) {
        int index = 0;
        for( int row = 0 ; row < matrix.length ; row++ ){
            for ( int col = 0 ; col < matrix[row].length ; col++ ){
                matrix[row][col] = values[index];
                index++;
            }
        }
    }

    private static void sortValues(int[] values) {
        for( int row = 0 ; row < values.length ; row++ ){
            for (int col = row+1 ; col < values.length ; col++ ){
                if( values[row] > values[col] ){
                    // swap the values
                    int temp ;
                    temp = values[row];
                    values[row] = values[col];
                    values[col] = temp;
                }
            }
        }
    }

    private static void copyValues(int[][] matrix, int []values) {

        int index;

        // copy all values from matrix to a 1D array
        index = 0;
        for (int[] rows : matrix) {
            for (int colValue : rows) {
                values[index] = colValue;
                index++;
            }
        }

    }

    private static void fillWithRandomValues(int[][] matrix, int maxValue) {

        int row;
        int col;

        for( row = 0 ; row < matrix.length ; row++ ){
            for (col = 0 ; col < matrix[row].length ; col++ ){
                matrix[row][col] = new Random().nextInt()%maxValue;
            }
        }

    }

    private static void printValues(int[][] matrix) {
        int row;
        int col;
        for( row = 0 ; row < matrix.length ; row++ ){
            for (col = 0 ; col < matrix[row].length ; col++ ){
                System.out.print( matrix[row][col] + " " );
            }
            System.out.println();
        }
    }

}
