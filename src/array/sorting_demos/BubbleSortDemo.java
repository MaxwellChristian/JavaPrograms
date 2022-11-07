
/*
*
* Write a program which can sort values using bubble sort algorithm
*
* Bubble sort:
* - compare a value with adjacent value
* - swap if necessary
* - continue till end of values
*
* */

package array.sorting_demos;

import array.ArrayMethods;

public class BubbleSortDemo {

    public static void main(String[] args){

        // generate some random int values [as per the desired count and max value]
        int[] values = ArrayMethods.getRandomIntValues(10, 100);

        System.out.print("Before Sort : ");
        ArrayMethods.printValues(values);
        System.out.println();

        // sort the values in desired order using a specific algorithm
        // order desired : Ascending
        // algorithm to use : bubble sort

        ArrayMethods.sort(ArrayMethods.BUBBLE_SORT, ArrayMethods.ASCENDING, values);

        System.out.print("After Sort  : ");
        ArrayMethods.printValues(values);
        System.out.println();

    }

}
