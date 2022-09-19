package string_demos;

public class StringComparisions {
    public static void main(String[] args){

        String text1 = "Hello Everybody !!";
        String text2 = "Hello World !!";

        System.out.println("Text1 : " + text1);
        System.out.println("Text2 : " + text2);

        // equals() : checks whether both strings are same or not and returns boolean
        // performs a case-sensitive comparison
        boolean areSame = text1.equals(text2);
        if( text1.equals(text2) ){
            System.out.println("Both texts are same");
        }
        else {
            System.out.println("Both texts are different");
        }

        // compareTo() : checks whether both strings are same or not and returns an int
        // subtracts the string with the parameter string and
        // returns the difference between first differing characters
        // performs a case-sensitive comparison
        // for e.g. text1 - text2

        // text1 : Hello Everybody !!
        // text2 : Hello World !!
        int differingAt = text1.compareTo(text2);
        if( text1.compareTo(text2) == 0 ){
            System.out.println("Both texts compares to same");
        }
        else {
            System.out.println("Both texts compares as different : " + differingAt);
            System.out.println("E-W: " + ((int)'E'-'W'));
        }

        text1 = "Hello";
        text2 = "hello";

        // equalsIgnoreCase : compares ignoring the case
        if( text1.equalsIgnoreCase(text2) ){
            System.out.println("Both texts are same [ignoring the case]");
        }
        else {
            System.out.println("Both texts are different [ignoring the case]");
        }

        // equalsIgnoreCase : compares ignoring the case
        if( text1.compareToIgnoreCase(text2) == 0 ){
            System.out.println("Both texts are same [ignoring the case]");
        }
        else {
            System.out.println("Both texts are different [ignoring the case]");
        }

        text1 = "ABC";
        text2 = "ACB";

        if( text1.compareTo(text2) < 0 ){
            System.out.println(text1 + " is before " + text2 + " in alphabetical order");
        }
        else {
            System.out.println(text2 + " is before " + text1 + " in alphabetical order");
        }

    }
}
