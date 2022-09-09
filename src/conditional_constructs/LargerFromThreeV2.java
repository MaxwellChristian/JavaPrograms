package conditional_constructs;

import java.util.Scanner;

public class LargerFromThreeV2 {

    public static void main(String[] args){

        int num1;
        int num2;
        int num3;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number 1 : ");
        num1 = input.nextInt();

        System.out.print("Enter number 2 : ");
        num2 = input.nextInt();

        System.out.print("Enter number 3 : ");
        num3 = input.nextInt();

        // && : logical AND operator
        // Returns TRUE only when both conditions are TRUE
        if( num1 == num2 && num1 == num3 ){
            System.out.println("All numbers are same");
        }
        else {
            if( num1 > num2 && num1 > num3 ){
                System.out.println(num1 + " is largest");
            }
            else {
                if( num2 > num1 && num2 > num3 ){
                    System.out.println(num2 + " is largest");
                }
                else {
                    if( num3 > num1 && num3 > num2 ){
                        System.out.println(num3 + " is largest");
                    }
                }
            }
        }

    }

}
