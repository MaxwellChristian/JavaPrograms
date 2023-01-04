package sorting_algorithms;

import array.utilities.ArrayUtilities;

public class MergeSortDemo {

    public static void main(String []args){

        int []values = {2, 9, 4, 8, 1, 6, 70};

        ArrayUtilities.printValues(values);
        System.out.println();

        mergeSortRecursive(values);

        ArrayUtilities.printValues(values);
        System.out.println();

    }

    private static void mergeSortRecursive(int[] values) {

        if (values.length > 1) {

            // Generate the first half
            int[] firstHalf = new int[values.length / 2];
            System.arraycopy(values, 0, firstHalf, 0, values.length / 2);
            // Merge sort the first half
            mergeSortRecursive(firstHalf);

            // Generate the first half
            int secondHalfLength = values.length - values.length / 2;
            int[] secondHalf = new int[secondHalfLength];
            System.arraycopy(values, values.length / 2, secondHalf, 0, secondHalfLength);
            // Merge sort the second half
            mergeSortRecursive(secondHalf);

            // Merge firstHalf with secondHalf into list
            merge(firstHalf, secondHalf, values);
        }
    }

    private static void merge(int[] leftHalf, int[] rightHalf, int[] mergedValues) {

        int leftIndex = 0; // Current index [for left list]
        int rightIndex = 0; // Current index [for right list]
        int destinationIndex = 0; // Current index [for final list]

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
