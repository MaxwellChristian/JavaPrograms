
/*
*
* Write a JAVA program which
*   - inputs a size from user
*   - creates a string array as per user provided size
*   - inputs different strings in the array
*
*   - sorts the string array
*   - displays the sorted values from string array
*
*   - sorts the array [ignoring the case]
*   - displays the sorted values from string array
*
*   - sorts the array [as per the length of the word]
*   - displays the sorted values from string array
*   - example : This is a test of JAVA
*   - output : a is of JAVA test This
* */

package array;

import array.utilities.ArrayUtilities;

import java.util.Arrays;
import java.util.Scanner;

public class StringValues {

    public static void main(String []args){

        // create the input line
        Scanner input = new Scanner(System.in);

        // input the size of array from user
        System.out.print("Enter the size : ");
        int size = input.nextInt();

        // create a string array as per user provided size
        String []values = new String[size];

        // input strings in the array from user
        int index ;

        for (index = 0 ; index < values.length ; index++){
            System.out.printf("Enter word %d: ", index);
            values[index] = input.next();
        }

        // print the array of strings
        System.out.println(Arrays.toString(values));

        // sort the values
        Arrays.sort(values);

        // print the array of strings [sorted order]
        System.out.println(Arrays.toString(values));

        // sort the values [ignoring the case]
        ArrayUtilities.sort(values, ArrayUtilities.SORT_ASCENDING, true);

        // print the array of strings [sorted order]
        System.out.println(Arrays.toString(values));

        // sort the values [ignoring the case and as per the length of each word]
        ArrayUtilities.sortByLength(values, ArrayUtilities.SORT_ASCENDING, true);

        // print the array of strings [sorted order]
        System.out.println(Arrays.toString(values));
    }

}
