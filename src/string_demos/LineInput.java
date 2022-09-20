package string_demos;


// Take a line of words from user as input
// Display the positions of FIRST TWO spaces from the line of text

import java.util.Scanner;

public class LineInput {

    public static void main(String [] args){

        int pos;

        // input a line of words

        Scanner input = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = input.nextLine();
        System.out.println("Text: " + text);

        // search for first space
        pos = text.indexOf(' ');
        if( pos != -1 ){
            System.out.println("First space is at : " + pos);

            // search for the second space
            pos = text.indexOf(' ', pos+1);
            if( pos != -1){
                System.out.println("Second space is at : " + pos);
            }

        }
        else {
            System.out.println("Np space found in text");
        }

        // search for the last two spaces
        // search for LAST space
        pos = text.lastIndexOf(' ');
        if( pos != -1 ){
            System.out.println("LAST space is at : " + pos);

            // search for the second LAST space
            pos = text.lastIndexOf(' ', pos-1);
            if( pos != -1){
                System.out.println("Second LAST space is at : " + pos);
            }

        }
        else {
            System.out.println("Np space found in text");
        }

    }

}
