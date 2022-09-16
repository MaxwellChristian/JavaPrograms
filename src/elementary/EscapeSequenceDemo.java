// Escape sequences are always starting with a back slash \
// \" : for double quote
// \\ : for backward slash
// \t : for tab
// \n : new line
// \f : form feed
// \b : backspace
// \r : carriage return

package elementary;

public class EscapeSequenceDemo {

    public static void main( String[] args ){

        System.out.println("Hello World");

        // print Hello Everybody. Welcome to "JAVA" !!
        System.out.println("Hello Everybody. Welcome to \"JAVA\" !!");

        // print Hello Everybody. \ is used for escape sequence !!
        System.out.println("Hello Everybody. \\ is used for escape sequence !!");

        // print Hello  Everybody
        System.out.println("Hello\tEverybody");

        // print
        // Hello
        // Everybody
        System.out.println("Hello\nEverybody");

        // print
        // Hello
        //      Everybody
        System.out.println("Hello\fEverybody");

        // use of \r will move the cursor back to the start of line
        // Hello\rEverybody
        // will display Everybody
        System.out.println("Hello\rEverybody");

        // use of \b will move the cursor back by one position
        // Hello-\bEverybody
        // will display HelloEverybody
        System.out.println("Hello-\bEverybody");

    }

}
