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

    }

}
