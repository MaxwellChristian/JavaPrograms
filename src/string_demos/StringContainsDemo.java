package string_demos;

// input two strings from user [through console]
// check if second string is contained in first string or not

import java.util.Scanner;

public class StringContainsDemo {

    public static void main(String[] args){

        String text1;
        String text2;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter text1: ");
        text1 = input.next();

        System.out.println("Enter text2: ");
        text2 = input.next();

        if( text1.contains(text2) ){
            System.out.println(text2 + " is in " + text1);
        }
        else {
            System.out.println(text2 + " is NOT in " + text1);
        }

        // check if a character exists in a text

        // indexOf(ch) : return the index from the text where ch occurs for the FIRST time.
        // if ch does not exist, then it returns -1
        if( text1.indexOf('e') != -1 ){
            System.out.println("e exists in " + text1);
        }
        else {
            System.out.println("e does not exist in " + text1);
        }

        // lastIndexOf(ch) : return the index from the text where ch occurs for the LAST time.
        // if ch does not exist, then it returns -1
        if( text1.lastIndexOf('e') != -1 ){
            System.out.println("e exists in " + text1);
        }
        else {
            System.out.println("e does not exist in " + text1);
        }

        // display the position where 'E' is found in the string
        int foundAtPosition = text1.indexOf('E');
        if( foundAtPosition != -1 ){
            System.out.println("Found at position : " + foundAtPosition);
        }
        else {
            System.out.println("Not found");
        }



    }

}
