/*
* This program demonstrates the use of rounding methods from Math library of Java i.e. Math class
* Methods explored
*   ceil
*   floor
*   round
*   rint
* */

package mathlibrary;

public class RoundingMethods {

    public static void main(String[] args){

        // ceil(x) functions rounds UP to the nearest int and returns it as a double value
        System.out.println("Math.ceil(2.1): " + Math.ceil(2.1));
        System.out.println("Math.ceil(2.8): " + Math.ceil(2.8));
        System.out.println("Math.ceil(2.0): " + Math.ceil(2.0));
        System.out.println("Math.ceil(-2.0): " + Math.ceil(-2.0));
        System.out.println("Math.ceil(-2.1): " + Math.ceil(-2.1));
        System.out.println("Math.ceil(-2.8): " + Math.ceil(-2.8));
        
        System.out.println();

        // floor(x) functions rounds DOWN to the nearest int and returns it as a double value
        System.out.println("Math.floor(2.1): " + Math.floor(2.1));
        System.out.println("Math.floor(2.8): " + Math.floor(2.8));
        System.out.println("Math.floor(2.0): " + Math.floor(2.0));
        System.out.println("Math.floor(-2.0): " + Math.floor(-2.0));
        System.out.println("Math.floor(-2.1): " + Math.floor(-2.1));
        System.out.println("Math.floor(-2.8): " + Math.floor(-2.8));

        System.out.println();

        // round(x) functions works as following:
        // - if x is float then it returns (int)Math.floor(x+0.5)
        // - if x is double then it returns (long)Math.floor(x+0.5)
        System.out.println("Math.round(2.1): " + Math.round(2.1));
        System.out.println("Math.round(2.8): " + Math.round(2.8));
        System.out.println("Math.round(2.0): " + Math.round(2.0));
        System.out.println("Math.round(-2.0): " + Math.round(-2.0));
        System.out.println("Math.round(-2.1): " + Math.round(-2.1));
        System.out.println("Math.round(-2.8): " + Math.round(-2.8));

        System.out.println();

        // rint(x) functions rounds to the nearest int.
        // If x is equally close to two integers, then even one is returned as a double value
        System.out.println("Math.rint(2.1): " + Math.rint(2.1));
        System.out.println("Math.rint(2.8): " + Math.rint(2.8));
        System.out.println("Math.rint(2.0): " + Math.rint(2.0));
        System.out.println("Math.rint(-2.0): " + Math.rint(-2.0));
        System.out.println("Math.rint(-2.1): " + Math.rint(-2.1));
        System.out.println("Math.rint(-2.8): " + Math.rint(-2.8));

        System.out.println("Math.rint(2.5): " + Math.rint(2.5));
        // 2.5 is equally close to 2 and 3 and hence it will return 2 [the even number]

        System.out.println("Math.rint(3.5): " + Math.rint(3.5));
        // 3.5 is equally close to 3 and 4 and hence it will return 4 [the even number]

    }

}
