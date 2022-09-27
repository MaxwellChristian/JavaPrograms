package practice_questions;

public class Test {

    public static void main(String[] args){

        String line = "Welcome to A test of JAVA units";

        int posOfSpace;
        int startPosition= 0;
        String wordSeparated;

        // word 1
//        posOfSpace = line.indexOf(' ', startPosition);
//        if( posOfSpace != -1 ){
//            wordSeparated = line.substring(startPosition, posOfSpace);
//            System.out.println(wordSeparated);
//            startPosition = posOfSpace+1;
//        }
//
//        // word 2
//        posOfSpace = line.indexOf(' ', posOfSpace+1);
//        if( posOfSpace != -1 ){
//            wordSeparated = line.substring(startPosition, posOfSpace);
//            System.out.println(wordSeparated);
//        }

        String finalOutput = "";

        for( startPosition = 0 ; startPosition < line.length() ; startPosition = posOfSpace+1 ){

            line.indexOf(' ');

            posOfSpace = line.indexOf(' ', startPosition);
            if( posOfSpace != -1 ){
                wordSeparated = line.substring(startPosition, posOfSpace);
                System.out.println(wordSeparated);

            }
            else {
                // it means there is no space
                // so the word extends till the end of the string
                posOfSpace = line.length();
                wordSeparated = line.substring(startPosition, posOfSpace);
                break;
            }

            switch ( wordSeparated.toLowerCase().charAt(0) ){
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
//                    System.out.println( wordSeparated + " starts with vowel " + wordSeparated.length());
                    finalOutput += ( "(" + wordSeparated + " : " + wordSeparated.length() + ")" );
            }

        }


        System.out.println(finalOutput);

    }

}
