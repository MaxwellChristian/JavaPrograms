package looping_constructs.using_for;

import java.util.Scanner;

public class ShowCharType {

    public static void main(String[] args) {

        // declaration
        String text;

        // input
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a line of text: ");
        text = input.nextLine();

        // processing

        // start point
        int counter;

        // check point
        for (counter = 0; counter < text.length(); counter++) {

            char ch = text.charAt(counter);
//            System.out.println(ch);

            if (Character.isDigit(ch)) {
                System.out.println(ch + " : Digit");
            } else {
                if (Character.isLetter(ch)) {
                    System.out.print(ch + " : Letter");
                    if (Character.isUpperCase(ch)) {
                        System.out.println(" : Upper case");
                    } else {
                        if (Character.isLowerCase(ch)) {
                            System.out.println(" : Lower case");
                        }
                    }
                } else {
                    if (ch == ' ') {
                        System.out.println(ch + " : space");
                    } else {
                        System.out.println(ch + " : alphabet");
                    }

                }
            }

        }

        // output

    }

}
