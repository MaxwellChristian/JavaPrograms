
/*
*
* Write a JAVA program which can search for a given value from array.
*
* Algorithm used: Binary Search
*
*  // splits the array in two half/sections
*  // compares the search value with the mid value
*  // if the search value is less than the mid value, continue to split the left section of the array
*  // if the search value is more than the mid value, continue to split the right section of the array
*  // continue til you find the value or the array values are completed
*
* Sample steps:
*   1 7 9 15 29 37 52
*
*   value to search : 37
*   step 1 :
*           array values to work : 1 7 9 15 29 37 52
*           mid value : 15
*           left half : 1 7 9
*           right half : 29 37 52
*           search value == mid value i.e 37 == 15 [so search value is not found]
*           search value < mid value [FALSE]
*           continue with right half [because search value is more than mid value]
*
*   step 2 :
*           array values to work : 29 37 52
*           mid value : 37
 *          left half : 29
 *          right half : 52
 *          search value == mid value i.e 37 == 37 [so search value is found. Stop]
* */


package array;

import array.utilities.ArrayUtilities;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchDemo {

    public static void main(String []args){

        // input the size for array
        Scanner input = new Scanner(System.in);
        System.out.print("Enter desired size of array: ");
        int sizeOfArray = input.nextInt();

        // declare an array as per user provided size
        int []values = new int[sizeOfArray];

        // fill the array with random values
        ArrayUtilities.fillWithRandomValues(values, 100, true);

        // print the array
        ArrayUtilities.printValues(values);
        System.out.println();

        // search for the value from array using binary search method

        // binary search works only on sorted values. so sort the values
        Arrays.sort(values);

        // print the array [sorted array]
        ArrayUtilities.printValues(values);
        System.out.println();

        // input the search value
        System.out.print("Enter the search value: ");
        int searchValue = input.nextInt();

        // search for the value
        int foundAtIndex = Arrays.binarySearch(values, searchValue);

        // check if the value is found in the array
        if( foundAtIndex > 0 ){
            System.out.printf("%d found in array at position %d\n", searchValue, foundAtIndex);
        }
        else {
            System.out.println(searchValue + " not found");
        }
    }

}
