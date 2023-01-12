package io_file_handling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFileUsingScanner {

    public static void main(String []args){

        // 1. Point to the file using File object
        File fileToWork = new File("src/data_files/generatedFile.txt");

        try {
            // 2. Attach the file to the reader [Scanner in this case]
            Scanner reader = new Scanner(fileToWork);

            String token;

            // check whether reader can read more from the file
            while (reader.hasNext()){
                token = reader.next();
                System.out.print(token);
                System.out.print(" ");

                token = reader.next();
                System.out.print(token);
                System.out.print(" ");

                token = reader.next();
                System.out.print(token);
                System.out.print(" ");

                token = reader.next();
                System.out.print(token);
                System.out.print(" ");

                double avg = reader.nextDouble();
                System.out.print(avg);
                System.out.print(" ");

                System.out.println();
            }

            // close the file
            reader.close();

        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
            System.out.println("File to read does not exist");
        }

    }

}
