/**
 * Write a program which can compute the area of a circle
 * Formula : :PI multiplied by SQUARE of RADIUS
 * <p>
 * input required is radius
 * result expected is AREA of CIRCLE
 * other values used for computing area : PI i.e. 3.14
 * <p>
 * what we learn:
 * - use of data type 'double'
 * - how does JAVA handles decimals
 * - default data type to work with decimals
 * - other options of data types to work with decimals
 * - how to take input of decimals
 */
package elementary;

import java.util.Scanner;

/**
 * @author christianm
 *
 */
public class AreaOfCircle {

    /**
     * @param args
     */
    public static void main(String[] args) {

        // declaration section
        double pi = 3.7415;
        double area;
        double radius;

        System.out.println("PI (double): " + pi);
        System.out.println("PI (int): " + (int) pi);
        System.out.println("PI (double): " + pi);

        int iPi = (int) pi;
        System.out.println("iPI (int): " + iPi);

        // input section
        Scanner defaultInput = new Scanner(System.in);

        System.out.print("Enter radius: ");
        radius = defaultInput.nextDouble();

        // processing section
        area = pi * radius * radius;

        // output section
        System.out.println("Circle with radius " + radius + " is " + area);

        System.out.println("Circle with radius " + radius + " is " + (area * 1000));
        System.out.println("Circle with radius " + radius + " is " + ((int) (area * 1000)));
        System.out.println("Circle with radius " + radius + " is " + ((double) (int) (area * 1000)) / 1000);

    }

}
