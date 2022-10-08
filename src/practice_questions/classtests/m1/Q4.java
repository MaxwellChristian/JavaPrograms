
/*
* Write a JAVA program which takes input of a word from user and displays them as following
*
* - first it displays ONE character from START and ONE character from END
* - then it displays TWO characters from START and TWO characters from END
* - then it displays THREE characters from START and THREE characters from END
*
* the same process continues till possible
* */

package practice_questions.classtests.m1;

import java.util.Scanner;

public class Q4 {

    public static void main(String []args){

        String text;
        String reverseText;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter text: ");
        text = input.next();
        reverseText = new StringBuffer(text).reverse().toString();

        int numOfCharacters = 1;
        int counter ;
        for(counter = 0 ; counter < text.length() ; counter++){
//            System.out.println(text.substring(0, numOfCharacters) + "-" + reverseText.substring(0, numOfCharacters));
//            System.out.println(text.substring(0, numOfCharacters) + "-" + text.substring(text.length()-numOfCharacters));

            String startCharacters = text.substring(0, numOfCharacters);
            String endCharacters = text.substring(text.length() - numOfCharacters);

            System.out.println(startCharacters + " " + endCharacters);


            numOfCharacters++;
        }

    }

}
