package array.sorting_demos;

import array.utilities.ArrayUtilities;

public class SortDemo {

    public static void main(String []args){

        // define an array with initial size to hold 5 values
        int []values = new int[5];

        // fill the array (values) with random numbers

        // fills the array with any random value
        // ArrayUtilities.fillWithRandomValues(values);

        // fills the array with random numbers ranging upto 90
        // ArrayUtilities.fillWithRandomValues(values, 90);

        // fills the array with random number ranging upto 90 and only positive numbers
        // ArrayUtilities.fillWithRandomValues(values, 90, true);

        ArrayUtilities.fillWithRandomValues(values, 90, true);

        // print the values
        ArrayUtilities.printValues(values);
        System.out.println();

        // sort the values [assuming ascending sort]
        // sort(values);

        // sort(values, 0); // 0 in 2nd parameter signifies ascending sort
        // sort(values, 1); // 1 in 2nd parameter signifies descending sort

        // ascending sort indicated using member variable of ArrayUtilities class
        // sort(values, ArrayUtilities.SORT_ASCENDING);

        // bubble sort algorithm: ascending sort indicated using member variable of ArrayUtilities class
        // sort_Bubble(values, ArrayUtilities.SORT_ASCENDING);

        // selection sort algorithm: ascending sort indicated using member variable of ArrayUtilities class
        // sort_Select(values, ArrayUtilities.SORT_ASCENDING);

        // sorting algorithm and order specified using member variable of ArrayUtilities class
        // sort(values, ArrayUtilities.SORT_ASCENDING, ArrayUtilities.BUBBLE_SORT);

        // sorting algorithm and order specified using member variable of ArrayUtilities class
        // sort(values, ArrayUtilities.SORT_ASCENDING, ArrayUtilities.SELECTION_SORT);

        ArrayUtilities.sort(values, ArrayUtilities.SORT_ASCENDING, ArrayUtilities.BUBBLE_SORT);

        // print the values
        ArrayUtilities.printValues(values);
    }

}
