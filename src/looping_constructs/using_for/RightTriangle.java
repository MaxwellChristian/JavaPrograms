
// #
// # #
// # # #

package looping_constructs.using_for;

public class RightTriangle {

    public static void main(String[] args) {

        int row, col;

        // first loop is suggested to be for rows
//        for( start point ; check point ; change point ){
//            
//        }

        for (row = 1; row <= 7; row++) {

            // print SPACE [decreasing each time]
            for( col = row ; col < 7 ; col++ ){
                System.out.print("  ");
            }

            // print each # ROW times
            for (col = 1; col <= row; col++) {
                System.out.print("# ");

            }

            // print a new line
            System.out.println();

        }

    }

}











