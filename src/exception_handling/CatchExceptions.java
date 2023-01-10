package exception_handling;

import java.util.Scanner;

public class CatchExceptions {

    public static void main(String []args){

        int num1 = 89;
        int num2 = 0;

        try {

            Scanner input = new Scanner(System.in);

            System.out.println("Enter value 1: ");
            num1 = input.nextInt();

            System.out.println("Enter value 2: ");
            num2 = input.nextInt();

            int ans = divide(num1, num2);
            System.out.println(ans);

            int []arr = createArray(num2);
            for(int i = 0 ; i < arr.length ; i++){
                arr[i] = i+1;
                System.out.println("arr : " + arr[i]);
            }

//            System.out.println("Program terminated");

        }

        catch( NegativeArraySizeException ex){
            System.out.println("In catch [NegativeArraySizeException]: " + ex);
//            System.out.println("Program terminated");
        }
        catch( ArrayIndexOutOfBoundsException ex){
            System.out.println("In catch [ArrayIndexOutOfBoundsException]: " + ex);
//            System.out.println("Program terminated");
        }
//        catch( ArithmeticException ex){
//            System.out.println("In catch [ArithmeticException]: " + ex);
//            System.out.println("Program terminated");
//        }
//        catch (Exception ex){
            // this catch (for Exception class) must be the last catch
//            System.out.println("In catch [Exception]: " + ex);
//            System.out.println("Program terminated");
//        }
        finally {
            // the finally block must be after all the catch blocks
            System.out.println("Program terminated");
        }

    }

    private static int[] createArray(int lengthOfArray) {
        try {
            return new int[lengthOfArray];
        }
        catch (NegativeArraySizeException ex){
            System.out.println("In fn CreateArray: Caught exception");
            throw ex;
        }

//        return new int[1];

    }

    private static int divide(int num1, int num2) {
        return num1/num2;
    }

}
