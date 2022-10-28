package array;

import java.util.Random;

public class ArrayMethods {

    public static final int TYPE_INT = 0 ;
    public static final int BUBBLE_SORT = 0;
    public static final int SELECTION_SORT = 1;
    public static final int ASCENDING = 0;
    private static final int DESCENDING = 1;

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
    public static void printArray(int[] values) {

        for (int currentValue :
                values) {
            System.out.print(currentValue + " ");
        }

    }

    // overloaded method to print array with double values
    public static void printArray(double[] values) {
        for (double currentValue :
                values) {
            System.out.print(currentValue + " ");
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

    public static void show2DValues(int[][] matrix) {
        int row;
        int col;

        for (row = 0 ; row < matrix.length ; row++) {
            System.out.print("| ");
            for( col = 0 ; col < matrix[row].length ; col++ ){
                System.out.printf("%2d ", matrix[row][col]);
            }
            System.out.print("|");
            System.out.println();
        }
    }

    public static void sortMatrix(int[][] matrix) {

        // copy all values to a 1D array

        // sort the 1D array

        // copy back to matrix

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

            System.out.printf("Pass %d : ", (currentCounter+1));
            printArray(values);
            System.out.println();

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
}
