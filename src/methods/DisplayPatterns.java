package methods;

import java.util.Scanner;
import java.util.stream.StreamSupport;

public class DisplayPatterns {

    public static void main(String []args){

        int choice = 0;
        int row ;
        int col ;

        Scanner input = new Scanner(System.in);

        do {

            System.out.println("1. Line");
            System.out.println("2. Block");
            System.out.println("3. Left aligned triangle");
            System.out.println("4. Right aligned triangle");
            System.out.println("5. Center aligned triangle");
            System.out.println("6. Pyramid");

            System.out.println("0. Exit");

            System.out.print("Enter your choice: ");
            choice = input.nextInt();

            switch (choice){
                case 1:

                    // line
                    for(col = 1; col <= 10  ; col++ ){
                        System.out.print("#");
                    }
                    System.out.println();

                    break;
                case 2:

                    // block

                    // call the method
                    printBlock();

                    break;
                case 3:

                    System.out.println("Before left triangle");

                    // execute the method
                    printLeftTriangle();

                    System.out.println("After left triangle");

                    break;
            }

        } while (choice != 0);

    }

    private static void printBlock() {

        int row;
        int col;

        for( row = 1 ; row <= 10 ; row++ ){
            for(col = 1; col <= 10  ; col++ ){
                System.out.print("#");
            }
            System.out.println();
        }
    }

    // method definition
    // 1: return type
    // 2: method name
    // 3: method arguments/parameters
    public static void printLeftTriangle() {
        int row;
        int col ;

        for( row = 1 ; row <= 10 ; row++ ){
            for(col = 1; col <= row  ; col++ ){
                System.out.print("#");
            }
            System.out.println();
        }

    }

}
