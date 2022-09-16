
// write a program to store 3 different characters
// do not take input from user. Use pre-stored values from program.
// Check the type of each character stored.

package character_demo;

import java.util.Scanner;

public class CharacterClassDemo {

    public static void main(String[] args){

        char ch;

        // characters are enclose in single quote
        // can hold only a single character
        ch = 'A';
        System.out.println("ch: " + ch);

        // enclosing anything in double quotes is considered as String
        // ch = "A";

        ch = '9';
        System.out.println("ch: " + ch);

        ch = 97;
        System.out.println("ch: " + ch);
        System.out.println("ch: " + (int)ch);

        // error: as 9 and 7 are two characters
        //ch = '97';
        //System.out.println("ch: " + ch);

        // error: as X and Y are two characters
        //ch = 'XY';
        //System.out.println("ch: " + ch);

        ch = (char)67.25;
        System.out.println("ch: " + ch);

        ch = 90;
        if( ch >= 65 && ch <= 90 ){
            System.out.println( ch + ": upper case character");
        }

        ch = 'j';
        if( ch >= 'a' && ch <= 'z' ){
            System.out.println( ch + ": lower case character : " + (int)ch);
        }


        ch = 'A';
        if( Character.isUpperCase(ch) ){
            System.out.println(ch + " is upper case");
        }

        ch = '5';
        if( Character.isDigit(ch) ){
            System.out.println(ch + " is digit");
        }
        else {
            System.out.println(ch + " is not a digit");
        }

        ch = '$';
        if( Character.isLetter(ch) ){
            System.out.println(ch + " is letter");
        }
        else {
            System.out.println(ch + " is not a letter");
        }




    }

}
