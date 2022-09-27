
//    1
//   1 2
//  1 2 3
// 1 2 3 4

package looping_constructs.using_for;

import java.util.Scanner;

public class SymmetricTriangle {

    public static void main(String[] args) {

        int row;
        int col;

        // input
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = input.nextInt();

        // first loop is suggested to be for rows
//        for( start point ; check point ; change point ){
//            
//        }

        for (row = 1; row <= n; row++) {

            // print SPACE [decreasing each time]
            for( col = row ; col < n ; col++ ){
                System.out.print(" ");
            }

            // print each # ROW times
            for (col = 1; col <= row; col++) {
//                System.out.print( "#" + " ");
                System.out.print( col + " ");
            }

            // print a new line
            System.out.println();

        }

    }

}











