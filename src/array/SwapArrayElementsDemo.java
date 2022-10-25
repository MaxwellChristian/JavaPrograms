package array;

import java.util.Scanner;

public class SwapArrayElementsDemo {

    public static void main(String []args){

        int []arr = {15, 10};

        swap(arr);

        System.out.println("Value 1 : " + arr[0]);
        System.out.println("Value 2 : " + arr[1]);
    }

    // swap method with ONE parameter i.e. 1 dimensional int array
    // overloaded method
    private static void swap(int[] values) {

        int temp ;

//        int[] arr2 = new int[2];
//        arr2[0] = values[0];
//        arr2[1] = values[1];

//        temp = arr2[0];
//        arr2[0] = arr2[1];
//        arr2[1] = temp;

        temp = values[0];
        values[0] = values[1];
        values[1] = temp;

    }

    // swap method with INT String parameters
    // overloaded method
    private static void swap(int value1, int value2) {

        int temp ;

        temp = value1;
        value1 = value2;
        value2 = temp;

    }

    // swap method with NO parameters
    // overloaded method
    private static void swap(){

    }

    // swap method with TWO String parameters
    // overloaded method
    private static void swap(String str1, String str2){

    }

    // swap method with INT String parameters
    // overloaded method
    private static void swap( int value1, String str1){

    }

    // NOT ALLOWED : as there is already a swap method with TWO int parameters
    // the RETURN type is not considered for overloaded methods
//    private static int swap(int v1, int v2){
//        return 0;
//    }


}
