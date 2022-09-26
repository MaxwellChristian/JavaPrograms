
/*
*
* Develop a JAVA program which can compute the value of PI using the following formula:
* PI = 4 – 4/3 + 4/5 – 4/7 + 4/9 – 4/11 …..
*
* */

package practice_questions;

public class MXPICalculation2 {

    public static void main(String[] args){

        // declaration
        int TOTAL_ITERATIONS = 100000;
        int counter;

        int operationSign = 1;
        double divisor = 1.0;
        double pi = 0;

        // input
        // No input required as per problem statement

        // processing

        // initialise the counter
        counter = 1 ;

        // iterate while the counter has not reached the desired value
        while ( counter <= TOTAL_ITERATIONS ){

            // the operationSign helps to decide for addition/subtraction operation
            pi += (4 / divisor * operationSign);

            // inverse the last used operation for next computation
            // [i.e. addition to subtraction and vice versa]
            operationSign *= -1;

            // increment the divisor by 2 for next computation
            divisor += 2;

            // change the counter
            // [i.e. increase or decrease the counter value]
            counter++;

            // System.out.println("Pi [25 iterations]: " + pi);
        }

        // output
        System.out.printf("%s [%d] %s : %.16f\n", "Pi", TOTAL_ITERATIONS," iterations", pi);

    }

}
