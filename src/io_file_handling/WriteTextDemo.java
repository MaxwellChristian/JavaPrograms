package io_file_handling;

// Write some data to a file

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class WriteTextDemo {

    public static void main(String []args){

        // 1. get an instance of the File
        File filetoWork = new File("src/data_files/generatedFile.txt");

        try {
            // 2. Link a writer/outputHandler to the fetched file
            PrintWriter writer = new PrintWriter( filetoWork );
//            PrintWriter writer = new PrintWriter( new File("src/data_files/generatedFile.txt") );

            // 3. print desired data to the file
            writer.print("Maxwell");
            writer.print(" ");

            writer.print("G");
            writer.print(" ");

            writer.print("Christian");
            writer.print(" ");

            writer.print("306-xxx-xxxx");
            writer.println();
            // ends record 1

            writer.print("Cameron");
            writer.print(" ");

            writer.print("J");
            writer.print(" ");

            writer.print("Brown");
            writer.print(" ");

            writer.print("306-xxx-xxxx");
            writer.println();
            // ends record 2

            // 4. close the file
            writer.close();

        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
            System.out.println("File to write does not exist");
        }

    }

}
