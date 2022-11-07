package methods;

import java.util.Scanner;

public class DisplayPatterns2 {

    public static void main(String []args){

        int choice;
        int size = 0;
        String symbol = "*";

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
                default:
                        if( choice >= 1 && choice <= 6 ){
                            System.out.print("Enter the desired size : ");
                            size = input.nextInt();
                            System.out.print("Enter the desire symbol : ");
                            symbol = input.next();
                        }
                        else {
                            System.out.println("Invalid choice");
                            break;
                        }
                case 1:

                    // line

                    // call the method
                    printLine(size, symbol);
                    System.out.println();

                    break;
                case 2:

                    // block

                    // call the method
                    printBlock(size, symbol);
                    System.out.println();

                    break;
                case 3:

                    // left triangle

                    System.out.println("Before left triangle");

                    // execute the method
                    printLeftTriangle(size, symbol);
                    System.out.println();

                    System.out.println("After left triangle");

                    break;
                case 4:

                    // right triangle

                    // execute the method
                    printRightTriangle(size, symbol);
                    System.out.println();

                    break;

                case 5:

                    // centre triangle

                    // execute the method
                    printCentreTriangle(size, symbol);
                    System.out.println();

                    break;
            }

        } while (choice != 0);



    }

    // method definition
    // 1: return type -> void
    // 2: method name -> printLeftTriangle
    // 3: method arguments/parameters -> ()
        // size : for the height of the triangle
        // symbol: character used to print the triangle
    private static void printLeftTriangle(int desiredHeight, String symbol) {
        int row;

        for( row = 1 ; row <= desiredHeight ; row++ ){
            printLine(row, symbol);
            System.out.println();
        }
    }

    // method definition
    // 1: return type -> void
    // 2: method name -> printLine
    // 3: method arguments/parameters -> ()
    // size : for the height of the line
    // symbol: character used to print the line
    private static void printLine(int desiredLength, String symbol) {

        int c ;
        for(c=1 ; c<=desiredLength ; c++){
            System.out.print(symbol);
        }

    }

    // method definition
    // 1: return type -> void
    // 2: method name -> printBlock
    // 3: method arguments/parameters -> ()
    // size : for the height of the block
    // symbol: character used to print the block
    private static void printBlock(int desiredHeight, String symbol) {
        int row;

        for( row = 1 ; row <= desiredHeight ; row++ ){
                printLine(desiredHeight, symbol);
                System.out.println();
        }

    }

    // method definition
    // 1: return type -> void
    // 2: method name -> printCentreTriangle
    // 3: method arguments/parameters -> ()
    // size : for the height of the triangle
    // symbol: character used to print the triangle
    private static void printCentreTriangle(int desiredHeight, String symbol) {
        int row;
        int col ;

        for( row = 1 ; row <= desiredHeight ; row++ ){

            printLine(desiredHeight-row, " ");
            printLine(row, "# ");

            System.out.println();
        }
    }


    // method definition
    // 1: return type -> void
    // 2: method name -> printRightTriangle
    // 3: method arguments/parameters -> ()
    // size : for the height of the triangle
    // symbol: character used to print the triangle
    private static void printRightTriangle(int desiredHeight, String symbol) {
        int row;
        int col ;

        for( row = 1 ; row <= desiredHeight ; row++ ){
            printLine(desiredHeight-row, " ");
            printLine(row, symbol);

            System.out.println();
        }
    }

}
