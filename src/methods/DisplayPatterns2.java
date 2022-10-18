package methods;

import java.util.Scanner;

public class DisplayPatterns2 {

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

                    System.out.print("enter length of the line: ");
                    int len = input.nextInt();
                    printLine(len);

                    System.out.println();

                    break;
                case 2:

                    // block

                    // call the method
                    System.out.print("Enter the length of the line: ");
                    len = input.nextInt();
                    printBlock(len);

                    break;
                case 3:

                    // left triangle

                    System.out.println("Before left triangle");

                    // execute the method
                    printLeftTriangle();

                    System.out.println("After left triangle");

                    break;
                case 4:

                    // left triangle

                    // execute the method
                    printRightTriangle();

                    break;

                case 5:

                    // left triangle

                    // execute the method
                    printCentreTriangle();

                    break;
            }

        } while (choice != 0);

    }

    private static void printLine(int desiredLength) {

        int c ;
        for(c=1 ; c<=desiredLength ; c++){
            System.out.print("#");
        }

    }

    private static void printBlock(int times) {
        int row;

        for( row = 1 ; row <= times ; row++ ){
                printLine(times);
                System.out.println();
        }

    }

    private static void printCentreTriangle() {
        int row;
        int col ;

        for( row = 1 ; row <= 10 ; row++ ){
            for(col = 1; col <= 10-row  ; col++ ){
                System.out.print(" ");
            }
            for(; col <= 10  ; col++ ){
                System.out.print("# ");
            }
            System.out.println();
        }
    }


    private static void printRightTriangle() {
        int row;
        int col ;

        for( row = 1 ; row <= 10 ; row++ ){
            for(col = 1; col <= 10-row  ; col++ ){
                System.out.print(" ");
            }
            for(; col <= 10  ; col++ ){
                System.out.print("#");
            }
            System.out.println();
        }
    }

    // method definition
    // 1: return type -> void
    // 2: method name -> printLeftTriangle
    // 3: method arguments/parameters -> ()
        // no parameters for this method
    public static void printLeftTriangle() {
        int row;
        int col ;

        for( row = 1 ; row <= 10 ; row++ ){
            printLine(row);
            System.out.println();
        }

    }

}
