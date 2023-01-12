package io_file_handling;

// input a source file from the user
// input the word to replace and the new word from the user
// replace all occurrences of given word from the specified file and
// write the replaced content to a new file
// display a message to the user with the path of the generated file

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ReplaceWordInFile {

    public static void main(String []args){


        // connect to system input
        Scanner input = new Scanner(System.in);

        // prompt and input and word to replace
        System.out.print("Enter word to replace: ");
        String wordToReplace = input.next();

        // prompt and input the word to be replaced by
        System.out.print("Enter word to be replaced by: ");
        String wordReplaceBy = input.next();

        try {

            // connect to the file to replace words in
            File sourceFile = new File("src/data_files/data.txt");
            File destinationFile = new File("src/data_files/replaced_data.txt");

            // check if you can read from the source file
            if( sourceFile.canRead() ){

                // connect a reader to the file to work with
                Scanner reader = new Scanner(sourceFile);

                // connect a writer to the file to store the replaced data
                PrintWriter writer = new PrintWriter(destinationFile);

                // read each word/line from the file
                while (reader.hasNext()){

                    // replace the required word occurrences in the file
                    String lineToWork = reader.nextLine();
                    lineToWork = lineToWork.replaceAll(wordToReplace, wordReplaceBy);

                    // store the replaced line in the destination file
                    writer.println(lineToWork);
                }

                // close the destination file
                writer.close();

                // close the source file
                reader.close();

                System.out.println("Replaced data saved at : " + destinationFile.getPath() );

            }
            else {
                System.out.println( sourceFile.getPath() + ": File is not readable");
            }

        } catch (FileNotFoundException e) {
            System.out.println("File does not exist: " + e.getMessage());
        }


    }

}
