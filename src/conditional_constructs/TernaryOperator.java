// Demonstrate the use of ternary operator

// var to assign = (condition to check) ? TRUE : FALSE;

package conditional_constructs;

public class TernaryOperator {

    public static void main(String[] args) {

        int x = 5;
        int y = 7;
        int z;

        // store the larger number in Z
        if (x > y) {
            z = x;
        } else {
            z = y;
        }

        // same can be achieved using ternary operator
        // ?:
        // -> after ? follows the TRUE part
        // -> and after : follows the FALSE part

        // should be used when assigning some value to common variable based on conditions

        z = (x > y) ? x : y;
        System.out.println("Z : " + z);

        x = 2;
        y = 5;
        z = 7;
        int largest;

        largest = (x > y) ? ((x > z) ? x : z) : ((y > z) ? y : z);
        System.out.println("Largest : " + largest);

        if (x > y && x > z) {
            largest = x;
        } else {
            if (y > x && y > z) {
                largest = y;
            } else {
                if (z > x && z > y) {
                    largest = z;
                }
            }
        }
    }

}
