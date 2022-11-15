package array;

import java.util.Arrays;

public class TestMethods {

    public static void main(String[] args) {

        // a 3D collection of 2 matrices, each of 3 rows and 5 cols
//        int[][][] matrices = {
//                {
//                        {11, 12, 13, 14, 15},
//                        {10, 20, 30, 40, 50},
//                        {100, 200, 300, 400, 500}
//                },
//                {
//                        {21, 22, 23, 24, 25},
//                        {210, 220, 230, 240, 250},
//                        {221, 222, 223, 224, 225}}
//        };

//        int[] flattenedArray = convert(matrices);
//        System.out.println(Arrays.toString(flattenedArray));

    }

    // find a value from an array
    int findValue(int[] arr, int valueToSearch) {
        // return the index of value from the array
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] == valueToSearch) {
                return index;
            }
        }
        // if not found then return -1
        return -1;
    }

    // join two arrays
    int[] joinArrays(int[] arr1, int[] arr2) {
        // returns a new int which has concatenated values of arr1 followed by arr2
        int[] newArr = new int[arr1.length + arr2.length];

        int pos = 0;

        for (int value : arr1) {
            newArr[pos++] = value;
        }
        for (int value : arr2) {
            newArr[pos++] = value;
        }

        return newArr;
    }

    // convert 2D to 1D array
    int[] convert(int[][] matrix) {
        // returns an array with all values from matrix

        int[] newArr = new int[matrix.length * matrix[0].length];

        int pos = 0;

        for (int[] arr : matrix) {
            for (int value : arr) {
                newArr[pos++] = value;
            }
        }

        return newArr;
    }

    // convert 3D to 1D array
    int[] convert(int[][][] values) {
        // returns an array with all values from the 3D array

        // create an array with zero elements
        int[] newArray = new int[0];

        // iterate on each element of 3D array
        for (int[][] matrix : values) {

            // the convert returns a 1D array from matrix
            // the returned 1D array is joined to the existing array in each iteration
            // the new joined array is used for next iteration
            newArray = joinArrays(newArray, convert(matrix));
        }

        return newArray;
    }

    // get values from array as per indices
    // version 1
    int[] fetchValues(int[] arr, int startIndex) {
        // returns an array having values starting from "startIndex" to end of the arr

//        int []newArr = new int[arr.length - startIndex + 1];
//        int pos = 0 ;
//        for (int index = startIndex ; index < arr.length ; index++){
//            newArr[pos++] = arr[index];
//        }
//
//        return newArr;

        return fetchValues(arr, startIndex, arr.length);
    }

    // get values from array as per indices
    // version 2
    int[] fetchValues(int[] arr, int startIndex, int endIndex) {
        // returns an array having values starting from "startIndex" to "endIndex" of the arr
        // return a null array when not able to copy/fetch

        // first check for all conditions
        // if not match return null array

        int[] newArr = new int[endIndex - startIndex + 1];
        int pos = 0;
        for (int index = startIndex; index < endIndex; index++) {
            newArr[pos++] = arr[index];
        }

        return newArr;
    }
}













