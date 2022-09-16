// Demonstrates the use of Math class for the below listed
// exp
// log
// log10
// pow
// sqrt

// constant E

package mathlibrary;

public class ExponentMethods {

    public static void main(String[] args){

        System.out.println("Math.E: " + Math.E);
        System.out.println("Math.PI: " + Math.PI);

        System.out.println("Math.exp(2): " + Math.exp(2));
        // Math.exp(x): e to the power x

        System.out.println("Math.exp(3.5): " + Math.exp(3.5));
        // Math.exp(x): e to the power x

        // Math.pow(x, y): return x raised to y
        System.out.println("Math.pow(2, 0): " + Math.pow(2, 0));
        System.out.println("Math.pow(2, 1): " + Math.pow(2, 1));
        System.out.println("Math.pow(2, 2): " + Math.pow(2, 2));
        System.out.println("Math.pow(2, 3): " + Math.pow(2, 3));
        System.out.println("Math.pow(2, 4): " + Math.pow(2, 4));

        // Math.sqrt(x) return square root of x (when x >= 0)
        System.out.println("Math.sqrt(64): " + Math.sqrt(64));
        System.out.println("Math.sqrt(64.7824): " + Math.sqrt(64.7824));
        System.out.println("Math.sqrt(-64): " + Math.sqrt(-64));
        System.out.println("Math.sqrt(0): " + Math.sqrt(0));

        // Math.log(x) returns natural log i.e. ln [log to base e]
        System.out.println("Math.log(2.5): " + Math.log(2.5));

        // Math.log10(x) returns base 10 log i.e. [log to base 10]
        System.out.println("Math.log10(2.5): " + Math.log10(2.5));
        System.out.println("Math.log10(10): " + Math.log10(10));

    }

}
