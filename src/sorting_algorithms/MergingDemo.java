package sorting_algorithms;

import array.utilities.ArrayUtilities;

public class MergingDemo {

    public static void main( String[] args ){

        int []arr1 = {2, 4, 5, 9, 10};
        int []arr2 = {1, 6, 7,8};
        int []finalArr = new int[arr1.length+ arr2.length];

        ArrayUtilities.printValues(arr1);
        System.out.println();

        ArrayUtilities.printValues(arr2);
        System.out.println();

        merge(arr1, arr2, finalArr);
        ArrayUtilities.printValues(finalArr);
        System.out.println();

    }

    private static void merge(int[] leftHalf, int[] rightHalf, int[] mergedValues) {

        int leftIndex = 0; // Current index [in left list]
        int rightIndex = 0; // Current index [in right list]
        int destinationIndex = 0; // Current index in [final list]

        while (leftIndex < leftHalf.length && rightIndex < rightHalf.length) {
            if (leftHalf[leftIndex] < rightHalf[rightIndex])
                mergedValues[destinationIndex++] = leftHalf[leftIndex++];
            else
                mergedValues[destinationIndex++] = rightHalf[rightIndex++];
        }

        while (leftIndex < leftHalf.length)
            mergedValues[destinationIndex++] = leftHalf[leftIndex++];

        while (rightIndex < rightHalf.length)
            mergedValues[destinationIndex++] = rightHalf[rightIndex++];
    }

}
