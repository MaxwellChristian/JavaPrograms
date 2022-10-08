
/*
*
Ask users to enter characters separated by space and end with ‘X’ or ‘x’. Print
out all characters whose ASCII code is divisible by 2 and 9.
For example, if the user enters “a b c d e f g h i j k l m n x”, the program will display "l"
*
*/

package practice_questions.classtests.m1;

import java.util.Scanner;

public class Q2 {

    public static void main(String []args){

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter chars(end with x or X");
        char ch = 0;
        do {
            ch = input.next().charAt(0);
            if(ch %2==0 && ch%9==0) {
                System.out.print(ch+" ");
            }

        }while (ch!='x' && ch!='X');

    }

}
