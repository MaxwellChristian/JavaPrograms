package methods;

import java.util.Scanner;

public class SwapDemo {

    public static void main(String []args){

        int value1 ;
        int value2 ;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter value 1 : ");
        value1 = input.nextInt();

        System.out.print("Enter value 2 : ");
        value2 = input.nextInt();

//        int temp ;
//
//        temp = value1;
//        value1 = value2;
//        value2 = temp;
        swap(value1, value2);

        System.out.println("Value 1 : " + value1);
        System.out.println("Value 2 : " + value2);
    }

    private static void swap(int value1, int value2) {

        int temp ;

        temp = value1;
        value1 = value2;
        value2 = temp;

    }

}
