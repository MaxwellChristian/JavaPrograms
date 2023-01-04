package searching_algorithms;

import array.utilities.ArrayUtilities;

public class BinarySearchDemo {

    public static void main(String []args){

        int []values = {10, 9, 90, 181, -9, -89, 189, 29};

        // print the unsorted list of values
        ArrayUtilities.printValues(values);
        System.out.println();

        // sort the list of values using SELECTION sort
        ArrayUtilities.sort(values, ArrayUtilities.SORT_ASCENDING, ArrayUtilities.BUBBLE_SORT);

        // print the sorted list of values
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

        foundAtIndex = binarySearchRecursive(values, valueToSearch, 0, values.length-1);
        if( foundAtIndex != -1 ){
            System.out.println(valueToSearch + " found at index " + foundAtIndex );
        }
        else {
            System.out.println(valueToSearch + " not found " );
        }

    }

    private static int binarySearchRecursive(int[] values, int valueToSearch, int left, int right) {

        // Restrict the bounds of
        // right index and the left index
        // to prevent overflow of indices
        if (right >= left && left <= values.length - 1) {

            int mid = left + (right - left) / 2;

            // compare to check if
            // search value is at mid-index
            if (values[mid] == valueToSearch)
                return mid;

            // If search values is smaller than mid,
            // then it can exist only in RIGHT sub-list of values
            // RIGHT sub-list: change the left to mid + 1
            if (valueToSearch > values[mid])
                return binarySearchRecursive(values, valueToSearch, mid + 1 , right);

            // If search values is smaller than mid,
            // then it can exist only in LEFT sub-list of values
            // LEFT sub-list: change the right to mid - 1
            return binarySearchRecursive(values, valueToSearch, left, mid - 1);
        }

        // search value does not exist in the list
        return -1;

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
            if (valueToSearch > values[mid])
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
