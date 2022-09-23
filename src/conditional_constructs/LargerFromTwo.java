// Input two numbers from user and display the larger number

package conditional_constructs;

import java.util.Scanner;

public class LargerFromTwo {

    public static void main(String[] args) {

//        declaration section
        int num1;
        int num2;

//        input section
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number 1: ");
        num1 = input.nextInt();

        System.out.print("Enter number 2: ");
        num2 = input.nextInt();

//        processing section

//        check whether both numbers are same or not
//        if (num1 == num2)
//        {
//            System.out.println("Both numbers are same");
//        }
//        else
//        {
////            check which number is larger
//            if (num1 > num2) {
//                System.out.println(num1 + " is larger");
//            } else {
//                System.out.println(num2 + " is larger");
//            }
//        }

        if (num1 != num2) {
            //            check which number is larger
            if (num1 > num2) {
                System.out.println(num1 + " is larger");
            } else {
                System.out.println(num2 + " is larger");
            }
        } else {
            System.out.println("Both numbers are same");
//        output section
        }
    }
}
