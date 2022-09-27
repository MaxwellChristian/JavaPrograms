
// #
// # #
// # # #

package looping_constructs.using_for;

public class LeftTriangle {

    public static void main(String[] args) {

        int row, col;

        // first loop is suggested to be for rows
//        for( start point ; check point ; change point ){
//            
//        }

        for (row = 1; row <= 7; row++) {

            // print each # ROW times
            for (col = 1; col <= row; col++) {
//                System.out.print("# ");
//                System.out.print( col );

//                System.out.print(((char) (row + 64)) + " ");
//                System.out.print(((char) (row + 'A' - 1)) + " ");

//                System.out.print( ((char)(col+64)) + " " );
                System.out.print(((char) (col + 'A' - 1)) + " ");
            }

            // print a new line
            System.out.println();

        }

    }

}











