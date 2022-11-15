package classtests.m2;

import java.util.Arrays;

public class SimulationTest2 {

    public static void main(String[] args) {

        // You can develop the test code here

        // generate a 1D array with random values
        int []arr1DValues = genRandom(10, 1, 100);
        int [][]arr2DValues = genRandom(3, 5, 50, 70);

        // search for a key from the 2D array
        // searching for the first value from the 2D array
        int[] countOfKey = countKey(arr2DValues, arr2DValues[0][0]);
        System.out.println("Count of " + arr2DValues[0][0] + " : " + Arrays.toString(countOfKey));

        // testing substring
        System.out.println("Extracted from 'Welcome to JAVA' : " + substr("Welcome to JAVA", 3, 6));

        // combining 3 different 1D arrays
        int []arr1 = {10, 20, 30};
        int []arr2 = {11, 21, 31};
        int []arr3 = {12, 22, 32};

        System.out.println("Array 1: " + Arrays.toString(arr1));
        System.out.println("Array 2: " + Arrays.toString(arr2));
        System.out.println("Array 3: " + Arrays.toString(arr3));
        System.out.println("Combined Array: " + Arrays.toString(concat(arr1, arr2, arr3)));

    }

    public static int[] genRandom(int nSize, int nLower, int nUpper) {
        // Declare a 1D array per nSize
        // Fill the array with random values between lower and upper range specified

        int[] arrValues = new int[nSize];
        for (int i = 0; i < arrValues.length; i++) {
            arrValues[i] = (int) (Math.random() * (nUpper - nLower)) + nLower;
        }
        return arrValues;
    }

    public static int[][] genRandom(int nRow, int nCol, int nLower, int nUpper) {
        // Declare a 2D array per nSize
        // Fill the array with random values between lower and upper range specified

        int[][] arr2DValues = new int[nRow][nCol];
        for (int row = 0; row < arr2DValues.length; row++) {
            for (int col = 0; col < nCol; col++)
                arr2DValues[row][col] = (int) (Math.random() * (nUpper - nLower)) + nLower;
        }
        return arr2DValues;
    }

    public static int[] countKey(int[][] arrList, int key) {
        // Count the elements in each row which is equal to key
        int[] count = new int[arrList.length];

        int row = 0;
        for (int[] arr : arrList) {
            count[row++] = countKey(arr, key);
        }

        // Return the count for each row in the array
        return count;
    }

    private static int countKey(int[] arr, int key) {
        int count = 0;
        for (int value : arr) {
            if (value == key) {
                count++;
            }
        }
        return count;
    }

    public static String substr(String sText, int nStart) {
        // Complete your code here.
        // No String method is allowed

        return substr(sText, nStart, sText.length());
    }

    public static String substr(String sVal, int nStart, int nEnd) {
        char[] arrLetters = sVal.toCharArray();
        char[] arrExtractedLetters = new char[nEnd - nStart];

        // Complete your code here.
        // No String method is allowed

        // assuming ideal case where nStart is less than nEnd and both are between 0 and length of text
        int destIndex = 0;
        for (int index = nStart; index < nEnd; index++) {
            arrExtractedLetters[destIndex++] = arrLetters[index];
        }

        return String.valueOf(arrExtractedLetters);
    }


    public static int[] concat(int[] arrValues1, int[] arrValues2) {
        // Return a new array which is combining arrValues1 and arrValues2
        // example: [1,2,3] + [4,5,6] = [1,2,3,4,5,6]

        int[] combinedArray = new int[arrValues1.length + arrValues2.length];

        int index = 0;

        for (int value : arrValues1) {
            combinedArray[index++] = value;
        }

        for (int value : arrValues2) {
            combinedArray[index++] = value;
        }

        return combinedArray;
    }

    public static int[] concat(int[] arrValues1, int[] arrValues2, int[] arrValues3) {
        // Return a new array which is combining arrValues1, arrValues2 and arrValues3
        // example: [1,2,3] + [4,5,6] + [7,8,9] = [1,2,3,4,5,6,7,8,9]

        return concat(concat(arrValues1, arrValues2), arrValues3);


    }

}
