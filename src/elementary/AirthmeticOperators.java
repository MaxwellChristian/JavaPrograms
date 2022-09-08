/**
 * 
 * Demonstration of basic arithmetic operators (+, -, *, 5, %)
 * What do we learn
 * - how arithmetic operators work
 * - precedence amongst arithmetic operators
 * - how to handle precedence
 * - how % operator works
 * - how to denote float and double values
 */
package elementary;

/**
 * @author christianm
 *
 */
public class AirthmeticOperators {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// addition
		System.out.println( "34 + 1 : " + (34 + 1) );
		
		// subtraction
		System.out.println( "34.0 - 0.1 : " + (34.0 - 0.1) );
		
		// multiplication
		System.out.println( "300*30 : " + (300*30) );
		
		// division: on numbers with decimal values 
		System.out.println( "20.0 / 3 : " + (20.0 / 3) );
		System.out.println( "20 / 3.0 : " + (20 / 3.0) );
		System.out.println( "20.0 / 3.0 : " + (20.0 / 3.0) );
		
		// division: on integer numbers
		System.out.println( "20 / 3 : " + (20 / 3) );
		// division: modulo operator (%) returns the remainder
		System.out.println( "20 % 3 : " + (20 % 3) );
		
		// division on float values
		System.out.println( "20.0f / 3 : " + (20.0f / 3) );
		System.out.println( "20 / 3.0F : " + (20 / 3.0F) );
		System.out.println( "20.0F / 3.0f : " + (20.0F / 3.0f) );

	}

}
