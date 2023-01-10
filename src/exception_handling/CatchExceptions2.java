package exception_handling;

import java.util.Scanner;

public class CatchExceptions2 {

    public static void main(String[] args) {

        int len;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter value: ");
        len = input.nextInt();

        int[] arr;
        try {
            arr = createArray(len);

            for (int i = 0; i < arr.length; i++) {
                arr[i] = i + 1;
                System.out.println("arr : " + arr[i]);
            }
        } catch (MyException e) {
            throw new RuntimeException(e);
        }

    }

    private static int[] createArray(int lengthOfArray) throws MyException {
        try {
            return new int[lengthOfArray];
        } catch (NegativeArraySizeException ex) {
            System.out.println("In fn CreateArray: Caught exception");
            throw new MyException("Array size must be non - negative");
        }
    }

}
