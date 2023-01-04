package searching_algorithms;

import java.util.ArrayList;

public class LinearSearchDemo {

    public static void main(String []args){

        // declaration section

        // declare an array to hold values
        int []values;
        ArrayList<Integer> arrList = new ArrayList<>();
        arrList.add(10);
        arrList.add(20);
        arrList.add(30);
        // declare a variable to hold the value to search
        int valueToSearch;

        // initialisation/input section

        // initialise/input the array
        values = new int[]{10, 20, 11, 89, 35};
        // initialise/input the search value
        valueToSearch = 9;

        // processing section

        // search for the value from the array. Return -1 when not found else the index where found

        // approach 1
        int foundAtIndex = -1;
        for( int counter = 0 ; counter < values.length ; counter++ ){
            if( values[counter] == valueToSearch ){
                foundAtIndex = counter;
                break;
            }
        }

        if( foundAtIndex != -1 ){
            System.out.println(valueToSearch + " found at " + foundAtIndex);
        }
        else {
            System.out.println(valueToSearch + " not found");
        }

        // approach 2
        foundAtIndex = linearSearch(values, valueToSearch);

        // approach 3
        arrList.indexOf(80);

        // output section

        // display an appropriate message as per search result

    }

    private static int linearSearch(int[] values, int valueToSearch) {

        for( int counter = 0 ; counter < values.length ; counter++ ) {
            if( values[counter] == valueToSearch ){
                return counter;
            }
        }

        return -1;
    }

}
