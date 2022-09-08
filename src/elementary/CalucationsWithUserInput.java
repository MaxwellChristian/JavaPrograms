/**
 * Write a program which 
 * - takes input of two whole numbers from user
 * - perform all basic arithmetic operations on the provided values
 * - display output of each arithmetic operation
 * 
 * what do we learn from this program:
 * - how to input values to a program
 * - how to work on the user input values
 * - how to display the resultant values
 */
package elementary;

import java.util.Scanner;

/**
 * @author christianm
 *
 */
public class CalucationsWithUserInput {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// declaration section
		int value1;
		int value2;
		int result;
		
		// input section
		
		// store the default input line using scanner
		Scanner inputLine = new Scanner(System.in);
		
		// take the input of desired and appropriate type
		System.out.print("Enter your value 1: ");
		value1 = inputLine.nextInt();
		
		System.out.print("Enter your value 2: ");
		value2 = inputLine.nextInt();
		
		// processing section
		result = value1 + value2;
		
		
		
		System.out.print("Hello");
		System.out.println("World");
		
		System.out.println("HelloWorld");
		
		System.out.println("Hello" + "World");
//		when using + with strings/words/text, it joins the strings
		
		
		// output section
//		System.out.print( "10 + 9 : 19" );
//		System.out.print( value1 + value2 : result );
//		System.out.println(result);
		
		System.out.print(value1);
		System.out.print("+");
		System.out.print(value2);
		System.out.print(":");
		System.out.println(result);
		
		System.out.println(value1 + " adds " + value2 + " results to " + result);
		// so when using + with a variable and a string, 
		// it joins both as strings
		
	}

}
