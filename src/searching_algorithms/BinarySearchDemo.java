package searching_algorithms;

import array.utilities.ArrayUtilities;

public class BinarySearchDemo {

    public static void main(String []args){

        int []values = {10, 9, 90, 181, -9, -89, 189, 29};
        ArrayUtilities.printValues(values);
        System.out.println();

        int valueToSearch = 189;
        int foundAtIndex ;

        foundAtIndex = binarySearch(values, valueToSearch);
        if( foundAtIndex != -1 ){
            System.out.println(valueToSearch + " found at index " + foundAtIndex );
        }
        else {
            System.out.println(valueToSearch + " not found " );
        }

    }

    private static int binarySearch(int[] values, int valueToSearch) {

        int left = 0, right = values.length - 1;

        // Checking element in whole array
        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Check if x is present at mid
            if (values[mid] == valueToSearch)
                return mid;

            // If x greater, ignore left half
            if (values[mid] < valueToSearch)
                left = mid + 1;

                // If x is smaller,
                // element is on left side
                // so ignore right half
            else
                right = mid - 1;
        }

        // If we reach here,
        // element is not present
        return -1;

    }

}
