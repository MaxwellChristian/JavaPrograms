package string_demos;

import java.util.Locale;

public class StringMethods {
    public static void main(String[] args){

        String text1 = "Hello Everybody !!";
        String text2 = "Hello World !!";

        System.out.println("Text1 : " + text1);
        System.out.println("Text2 : " + text2);

        // compute the length of the string
        int lengthOfString = text1.length();
        System.out.println(text1 + " has length " + lengthOfString);

        // check if a given string STARTS with a particular string sequence
        if( text1.startsWith("He") ){
            System.out.println(text1 + " : starts with (He)");
        }else {
            System.out.println(text1 + " : does not start with (He)");
        }

        // check if a given string ENDS with a particular string sequence
        if( text1.endsWith("!!") ){
            System.out.println(text1 + " : ends with (!!)");
        }else {
            System.out.println(text1 + " : does not end with (!!)");
        }

        // convert a string to LOWER CASE and return the string
        text1.toLowerCase(); // the TEXT1 will not be converted to LOWER CASE. The result needs to be stored.
        System.out.println(text1);

        String text1InLowerCase = text1.toLowerCase(); // LOWER CASE of TEXT1 will be returned for assignment.
        System.out.println("In LOWER case : " + text1InLowerCase);

        // convert a string to UPPER CASE and return the string
        text1.toUpperCase(); // the TEXT1 will not be converted to UPPER CASE. The result needs to be stored.
        System.out.println(text1);

        String text1InUpperCase = text1.toUpperCase(); // UPPER CASE of TEXT1 will be returned for assignment.
        System.out.println("In UPPER case : " + text1InUpperCase);

        // TRIM returns a new string with after removing blank spaces at the BEGINNING and ENDING of the string
        String testText = "   !! Welcome !!   "; // the text consists of WHITE spaces at the BEGINNING and ENDING
        String trimmedText = testText.trim();
        System.out.println( testText + " : Text with white spaces [before and after the text]");
        System.out.println( trimmedText + " : Text after trim.");

    }
}
