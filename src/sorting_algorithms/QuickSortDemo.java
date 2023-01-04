package sorting_algorithms;

import array.utilities.ArrayUtilities;

public class QuickSortDemo {

    public static void main(String []args){

        int[] values = {2, 3, 112, 5, 6, 1, -2, 31, 14, 12};

        ArrayUtilities.printValues(values);
        System.out.println();

        quickSortAlgorithm(values);

        ArrayUtilities.printValues(values);
        System.out.println();
    }

    public static void quickSortAlgorithm(int[] list) {
        quickSortRecursive(list, 0, list.length - 1);
    }

    private static void quickSortRecursive(int[] list, int first, int last) {
        if (last > first) {
            int pivotIndex = partition(list, first, last);

//            System.out.print(" : " + list[pivotIndex]);
            System.out.print( " -> ");
            ArrayUtilities.printValues(list);
            System.out.println();

            quickSortRecursive(list, first, pivotIndex - 1);
            quickSortRecursive(list, pivotIndex + 1, last);
        }
    }

    private static int partition(int[] list, int first, int last) {
        int pivot = list[first];    // Choose the first element as the pivot
        int low = first + 1;        // Index for forward search
        int high = last;            // Index for backward search

        System.out.print(pivot + " : ");

        while (high > low) {

            // Search forward from left
            while (low <= high && list[low] <= pivot)
                low++;

            // Search backward from right
            while (low <= high && list[high] > pivot)
                high--;

            // Swap two elements in the list
            if (high > low) {
                int temp = list[high];
                list[high] = list[low];
                list[low] = temp;
            }
        }

        while (high > first && list[high] >= pivot)
            high--;

        // Swap pivot with list[high]
        if (pivot > list[high]) {
            list[first] = list[high];
            list[high] = pivot;

//            ArrayUtilities.printValues(list);
            ArrayUtilities.printValues(list, first, last+1);
//            System.out.println();

            return high;
        }
        else {

//            ArrayUtilities.printValues(list);
            ArrayUtilities.printValues(list, first, last+1);
//            System.out.println();

            return first;
        }


    }

}
