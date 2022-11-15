package classtests.m2;

public class SimulationTest2 {

    public static void main(String[] args) {

        // You can develop the test code here

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

    public int[] countKey(int[][] arrList, int key) {
        // Count the elements in each row which is equal to key

        // Return the count for each row in the array
    }

    public String substr(String sText, int nStart) {
        // Complete your code here.
        // No String method is allowed
    }


    public String substr(String sVal, int nStart, int nEnd) {
        char[] arrLetters = sVal.toCharArray();
        char[] arrExtractedLetters = null;

        // Complete your code here.
        // No String method is allowed

        return String.valueOf(arrExtractedLetters);
    }


    public int[] concat(int[] arrValues1, int[] arrValues2) {
        // Return a new array which is combining arrValues1 and arrValues2
        // example: [1,2,3] + [4,5,6] = [1,2,3,4,5,6]

    }

    public int[] concat(int[] arrValues1, int[] arrValues2, int[] arrValues3) {
        // Return a new array which is combining arrValues1, arrValues2 and arrValues3
        // example: [1,2,3] + [4,5,6] + [7,8,9] = [1,2,3,4,5,6,7,8,9]

    }

}
