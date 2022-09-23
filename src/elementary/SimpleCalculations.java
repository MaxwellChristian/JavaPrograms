/**
 * Try to perform some basic caluclations
 * addition, subtraction, multiplication, division
 * <p>
 * what we learn from this program
 * - concept of variables
 * - concept of data types
 * - concept of arithmetic operators
 * - addition 			: +
 * - subtraction 		: -
 * - multiplication 	: *
 * - division 			: /
 * - difference between PRINT and PRINTLN
 * <p>
 * e.g. 5 + 2 = 7 [in maths]
 * in programming -> 7 = 5 + 2
 * <p>
 * = -> operator known as "assignment operator"
 * it always works from RIGHT to LEFT
 * <p>
 * so to store the output/result of an operation using assignment operator
 * we need VARIABLES [containers for values]
 */
package elementary;

/**
 * @author christianm
 *
 */
public class SimpleCalculations {

    /**
     * @param args
     */
    public static void main(String[] args) {

        // declare a variable to store the result of an operation
        int result;
        // (int) is the data type : can hold only whole integers
        // (result) is the variable/container which will hold integer values

        result = 10;
        // here "=" is the assignment operator
        // which will assign the value of RHS to LHS
        // i.e. store 10 to variable named "result"

        System.out.println("result"); // this will print the word "result" as it is enclosed between quotes
        System.out.println(result); // this will print the 7 i.e. the value stored in the variable

        // addition operator
        result = 5 + 2;
        // first the RHS will perform
        // then the resultant value will be stored to LHS i.e. the variable
        System.out.println("result"); // this will print the word "result" as it is enclosed between quotes
        System.out.println(result); // this will print the 7 i.e. the value stored in the variable

        // subtraction operator
        result = 5 - 2;
        System.out.println("result");
        System.out.println(result);

        // multiplication operator
        result = 5 * 2;
        System.out.println("result");
        System.out.println(result);

        int value1 = 5;
        int value2 = 3;

        // addition using all variables
        result = value1 + value2;
        System.out.print("Addition:");
        System.out.println(result);
        // println : move the current position to a new line after printing

        // subtraction using all variables
        result = value1 - value2;
        System.out.print("Subtraction:");
        System.out.println(result);

        // multiplication using all variables
        result = value1 * value2;
        System.out.print("Multiplication:");
        System.out.println(result);

        // division using all variables
        result = value1 / value2;
        System.out.print("Division:");
        System.out.println(result);

    }

}
