package array.utilities;

import java.util.Random;

public class ArrayUtilities {

    public static final int SORT_ASCENDING = 0;
    public static final int SORT_DESCENDING = 1;

    public static final int BUBBLE_SORT = 0;
    public static final int SELECTION_SORT = 1;

    public static int findMaximum(int[][] matrix) {

        int max = matrix[0][0];

        for (int[] rows : matrix) {
            for (int colValue : rows) {
                if (colValue > max) {
                    max = colValue;
                }
            }
        }

        return max;
    }

    public static void printValues(int[][] matrix) {
        for (int[] rows : matrix) {
            for (int colValue : rows) {
                System.out.print(colValue + " ");
            }
            System.out.println();
        }
    }

    public static void fillWithRandomValues(int[][] matrix, int maxValue, boolean positiveValueOnly) {

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                matrix[row][col] = (positiveValueOnly) ? Math.abs(new Random().nextInt() % maxValue) : new Random().nextInt() % maxValue;
            }
        }

    }

    public static void fillWithRandomValues(int[] values, int maxValue, boolean positiveValueOnly) {
        for (int index = 0; index < values.length; index++) {
            values[index] = (positiveValueOnly) ? Math.abs(new Random().nextInt() % maxValue) : new Random().nextInt() % maxValue;
        }
    }

    public static void printValues(int[] values) {
        for (int currentValue : values) {
            System.out.print(currentValue + " ");
        }
    }

    public static void sort(int[] values, int sortOrder, int sortingAlgorithm) {

        switch (sortingAlgorithm) {
            case BUBBLE_SORT -> {
                bubbleSort(values, sortOrder);
            }
            case SELECTION_SORT -> {
                selectionSort(values, sortOrder);
            }
        }
    }

    private static void selectionSort(int[] values, int sortOrder) {

    }

    private static void bubbleSort(int[] values, int sortOrder) {
        for (int index1 = 0; index1 < values.length; index1++) {
            for (int index2 = index1 + 1; index2 < values.length; index2++) {
                switch (sortOrder) {
                    case SORT_ASCENDING -> {
                        if (values[index1] > values[index2]) {
                            int temp;
                            temp = values[index1];
                            values[index1] = values[index2];
                            values[index2] = temp;
                        }
                    }
                    case SORT_DESCENDING -> {
                        if (values[index1] < values[index2]) {
                            int temp;
                            temp = values[index1];
                            values[index1] = values[index2];
                            values[index2] = temp;
                        }
                    }
                }
            }
        }
    }

    public static int[] search(int[][] matrix, int searchValue) {

        for( int row = 0 ; row < matrix.length ; row++ ){
            for( int col = 0 ; col < matrix[row].length ; col++ ) {
                if( matrix[row][col] == searchValue ){
                    return new int[]{row, col};
                }
            }
        }

        return new int[]{-1, -1};
    }

    public static void sort(String[] values, int sortOrder, boolean ignoreCase) {

        int i;
        int j;

        for (i = 0 ; i < values.length ; i++) {
            for( j = i+1 ; j < values.length ; j++ ){

                //if( values[i] > values[j] ){
                if( values[i].compareToIgnoreCase(values[j]) > 0 ){

                    // swap
                    String temp;
                    temp = values[i];
                    values[i] = values[j];
                    values[j] = temp;
                }

            }
        }

    }

    public static void sortByLength(String[] values, int sortAscending, boolean ignoringCase) {
        int i;
        int j;

        for (i = 0 ; i < values.length ; i++) {
            for( j = i+1 ; j < values.length ; j++ ){

                //if( values[i] > values[j] ){
                if( values[i].compareToIgnoreCase(values[j]) > 0 && values[i].length() > values[j].length() ){

                    // swap
                    String temp;
                    temp = values[i];
                    values[i] = values[j];
                    values[j] = temp;
                }

            }
        }
    }
}

