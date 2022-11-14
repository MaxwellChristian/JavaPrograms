package array;

import java.util.Random;

public class ArrayMethods {

    public static final int TYPE_INT = 0 ;
    public static final int BUBBLE_SORT = 0;
    public static final int SELECTION_SORT = 1;
    public static final int ASCENDING = 0;
    private static final int DESCENDING = 1;

    public static final int ROW_SORT = 0;
    public static final int COL_SORT = 1;

    public static double[] getRandomDoubleValues(int noOfValues, int maxValue) {

        double[] values = new double[noOfValues];

        for (int index = 0; index < values.length; index++) {
            values[index] = new Random().nextDouble(maxValue);
        }

        return values;
    }

    public static int[] getRandomIntValues(int noOfValues, int maxValue) {

        int[] values = new int[noOfValues];

        for (int index = 0; index < values.length; index++) {
            values[index] = new Random().nextInt(maxValue);
        }

        return values;
    }

    // overloaded method to print array with int values
    public static void printValues(int[] values) {

        for (int currentValue :
                values) {
            System.out.printf("%3d ", currentValue);
        }

    }

    // overloaded method to print array with double values
    public static void printValues(double[] values) {
        for (double currentValue :
                values) {
            System.out.print(currentValue + " ");
        }
    }

    public static void printValues(int[] values, int maxDigits, char separator){
        String format = "%" + maxDigits + "d" + "%c" ;
        for (int value : values) {
            System.out.printf(format, value, separator);
        }
    }

    public static int countOccurrences(int[] values, int searchValue) {

        int count = 0 ;
        for(int index = 0 ; index < values.length ; index++){
            if( values[index] ==  searchValue ){
                count++;
            }
        }

        return count;
    }

    public static void sortMatrix(int[][] matrix) {

        // declare a 1D array which can hold all values from 2D array
        int []values = new int[matrix.length * matrix[0].length];

        // copy all values to a 1D array
        int destPos = 0 ;
        int row ;
        int col ;
        for( row = 0 ; row < matrix.length ; row++ ){
            for (col = 0 ; col < matrix[row].length ; col++) {
                values[destPos] = matrix[row][col];
                destPos++;
            }
        }

        // sort the 1D array
        sort(BUBBLE_SORT, ASCENDING, values);

        // copy back to matrix
        destPos = 0;
        for( row = 0 ; row < matrix.length ; row++ ){
            for (col = 0 ; col < matrix[row].length ; col++) {
//                values[destPos] = matrix[row][col];
                 matrix[row][col] = values[destPos];
                destPos++;
            }
        }

    }

    public static void sort(int algorithm, int sortOrder, int[] values) {

        switch (algorithm) {
            case BUBBLE_SORT -> {
                bubbleSort(sortOrder, values);
            }
            case SELECTION_SORT -> {
//                selectionSort(sortOrder, values);
            }
        }

    }

    public static void sort(int algorithm, int sortOrder, int rowOrCol, int[][] matrix){

        switch (rowOrCol){
            case ROW_SORT -> {
                switch (algorithm){
                    case BUBBLE_SORT -> {
                        for(int row = 0 ; row < matrix.length ; row++){
                            bubbleSort(sortOrder, matrix[row]);
                        }
                    }
                }
            }
            case COL_SORT ->
            {
                // iterate for each COL from the matrix
                    // assuming that each row of the matrix has same number of cols i.e. square matrix
                for(int col = 0 ; col < matrix[0].length ; col++){

                    // for each col, repeat the below-mentioned steps

                    // transfer the values from COL to a 1D array

                    // size of the 1D array is same as total rows in the matrix
                    int []colValues = new int[matrix.length];
                    for(int row = 0 ; row < colValues.length ; row++){
                        colValues[row] = matrix[row][col];
                    }

                    // sort the 1D array
                    sort(BUBBLE_SORT, ASCENDING, colValues);

                    // transfer the values back from the 1D array to the COL
                    for(int row = 0 ; row < colValues.length ; row++){
                        matrix[row][col] = colValues[row];
                    }
                }



            }
        }

    }

    private static void bubbleSort(int sortOder, int[] values){
        int currentCounter;
        int adjacentCounter;

        // iterate over all values
        for( currentCounter = 0 ; currentCounter < values.length ; currentCounter++ ){

            // iterate over all adjacent values
            for( adjacentCounter = currentCounter+1 ; adjacentCounter < values.length ; adjacentCounter++ ){

                // compare the current value with the adjacent value
                // as per sorting order required

                switch (sortOder){
                    case ASCENDING -> {
                        // Ascending order
                        if( values[currentCounter] > values[adjacentCounter] ){
                            // swap the values
                            swap(values, currentCounter, adjacentCounter);
                        }
                    }
                    case DESCENDING -> {
                        // DESCENDING order
                        if( values[currentCounter] < values[adjacentCounter] ){
                            // swap the values
                            swap(values, currentCounter, adjacentCounter);
                        }
                    }
                }

            }

//            System.out.printf("Pass %d : ", (currentCounter+1));
//            printArray(values);
//            System.out.println();

        }
    }

    private static void swap(int[] values, int position1, int position2) {

        // using an extra variable
//        int temp;
//        temp = values[position1];
//        values[position1] = values[position2];
//        values[position2] = temp;

        // without using extra variable;
        // p1 : 10
        // p2 : 5

        values[position1] = values[position1] + values[position2]; // p1 : 15, p2 : 5
        values[position2] = values[position1] - values[position2]; // p1 : 15, p2 : 10
        values[position1] = values[position1] - values[position2]; // p1 : 5, p2 : 10

    }

    public static void printValues(int[][] matrix, int maxDigits, char separator) {
        for( int row = 0 ; row < matrix.length ; row++ ){
            System.out.print("|");
            ArrayMethods.printValues(matrix[row], maxDigits, separator);
            System.out.print("|");
            System.out.println();
        }
    }

    public static void printValues(int[][] matrix) {
        for( int row = 0 ; row < matrix.length ; row++ ){
            System.out.print("|");
            ArrayMethods.printValues(matrix[row], 2, ' ');
            System.out.print("|");
            System.out.println();
        }
    }
}
