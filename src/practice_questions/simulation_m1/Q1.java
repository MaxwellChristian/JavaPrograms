package practice_questions.simulation_m1;

import java.util.Scanner;

public class Q1 {

    public static void main(String []args) throws SizeMisMatchException {

        // declaration of arrays
        int []arr1;
        int []arr2;
        int []arr3;

        int size1;
        int size2;
        int size3;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter size for array 1: ");
        size1 = input.nextInt();

        System.out.print("Enter size for array 2: ");
        size2 = input.nextInt();

        System.out.print("Enter size for array 3: ");
        size3 = input.nextInt();

        // check if all arrays are of same size
        if( size1 == size2 && size1 == size3 ){

            arr1 = new int[size1];
            arr2 = new int[size2];
            arr3 = new int[size3];

            // input of values to arrays
            inputArrayValues(arr1, "Enter value for Array 1");
            inputArrayValues(arr2, "Enter value for Array 2");
            inputArrayValues(arr3, "Enter value for Array 3");

            // call to the testSummation method
            boolean result = testSummation(arr1, arr2, arr3, 0);

            // output of result
            System.out.println("Result : " + result);

        }
        else {
            // raise a custom exception in case the arrays are not equal in size
            throw new SizeMisMatchException("All arrays must be of same size");
        }

    }

    private static boolean testSummation(int[] arr1, int[] arr2, int[] arr3, int index) {

        if( index < arr1.length ){
            if (arr1[index] + arr2[index] == arr3[index]) {
                return testSummation(arr1, arr2, arr3, index+1);
            }
            else {
                return false;
            }
        }

        return true;
    }

    private static void inputArrayValues(int[] array, String prefixMessage) {

        Scanner input = new Scanner(System.in);

        for(int counter = 0 ; counter < array.length ; counter++){
            System.out.print(prefixMessage + " [" + (counter+1) + "] : ");
            array[counter] = input.nextInt();
        }
    }

}
