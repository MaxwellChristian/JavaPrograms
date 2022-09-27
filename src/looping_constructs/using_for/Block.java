
// # # # # #
// # # # # #
// # # # # #

package looping_constructs.using_for;

public class Block {

    public static void main(String []args){

        int row, col;

        // first loop is suggested to be for rows
//        for( start point ; check point ; change point ){
//
//        }

        for( row = 1 ; row <= 3 ; row++ ){

            // print each # 5 times
            for ( col = 1 ; col <= 5 ; col++) {
                System.out.print("# ");
            }

            // print a new line
            System.out.println();

        }

    }

}











