
/*
*
* Write a JAVA program which can search for an input value from different values
* provided by the user
*
* user first inputs the number of values he wishes to provide
*
*
* i.e. user provides different values as per choice
* then a search value
*
* program outputs the count of search value in the provided values
*
* */


package array;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SearchValues {

    public static void main(String []args){

        int noOfValues;
        int []values;
        int searchValue;
        int occurrencesOfSearchValue;

        Scanner input = new Scanner(System.in);

        System.out.print("How many values to want to enter? ");
        noOfValues = input.nextInt();

        // create an array to hold all input values
        // the size of the array must be as specified  by the user
        values = new int[noOfValues];

//        int index ;
//        for(index = 0 ; index < noOfValues ; index++){
//            System.out.printf("Enter value[%2d]: ", index);
//            values[index] = input.nextInt();
//        }

        values = getArrayWithRandomValues(noOfValues, 100);

        System.out.print("Value to search: ");
        searchValue = input.nextInt();

        int count = countOccurrences(values, searchValue);
        System.out.printf("Occurrences of %2d: %2d\n", searchValue, count);

        // print the array values

        // option 1 : using a custom print method
        printArray(values, ' ');
        System.out.println();

        // option 2 : using in-built Arrays.toString()
        System.out.println(Arrays.toString(values));

        //

    }

    private static int[] getArrayWithRandomValues(int noOfValues, int maxValue) {

        int []values = new int[noOfValues];

        for(int index = 0 ; index < values.length ; index++){
            values[index] = new Random().nextInt() %  maxValue;
        }

        return values;
    }

    private static void printArray(int[] values, char separator) {

        for(int index = 0 ; index < values.length ; index++){
            System.out.print(values[index] + "" + separator);
        }

//        for (int value : values) {
//            System.out.print(value + separator);
//        }
    }

    private static int countOccurrences(int[] values, int searchValue) {

        int count = 0 ;
        for(int index = 0 ; index < values.length ; index++){
            if( values[index] ==  searchValue ){
                count++;
            }
        }

        return count;
    }


}
