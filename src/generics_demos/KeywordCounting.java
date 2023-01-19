package generics_demos;

// display all the keywords used in a java program

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class KeywordCounting {

    public static void main(String[] args){

        // create a list of keywords in JAVA
        String []keywords = {
                "null",
                "public", "package", "static", "void",
                "import",
                "new", "if", "else", "for", "while", "do", "continue",
                "switch", "case", "break", "default", "true", "false",
                "class", "interface", "extends", "implements",
                "private", "protected",
                "int", "char", "float", "double", "long", "byte", "boolean",
                "try", "catch", "finally", "throw", "throws",
                "super",
                "return",
                "final",
                "abstract",
                "transient",
                "enum"
        };

        // open a java file
        // instance of File
        File sourceFile = new File("src/generics_demos/HashSetDemo.java");

        try {
//            System.out.println("Path to .: " + new File("src/generics_demos/HashSetDemo.java").getAbsolutePath() );
            Scanner fileScanner = new Scanner(sourceFile);

            // generate a set of unique keywords
            Set<String> keywordSet = new HashSet<>(List.of(keywords));

            // the set to display
            Set<String> keywordsFromFile = new HashSet<>();

            // read all tokens from the java file
            String token = "";
            while (fileScanner.hasNext()){
                token = fileScanner.next();

                // for each token
                // compare the token with the list of keywords
                if( keywordSet.contains(token) ){
                    // store the token [the keyword from source file] to a new unique set
                    keywordsFromFile.add(token);
                }
            }

            // close the file
            fileScanner.close();

            // display the keywords used in the java file [non duplicates]
            System.out.println(keywordsFromFile);

        } catch (FileNotFoundException e) {
            System.out.println(Arrays.toString(e.getStackTrace()));
        }



    }

}
