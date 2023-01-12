package io_file_handling;

import java.io.*;

public class ReadWriteUsingOutputStream {

    public static void main(String []args){

        File destinationFile = new File("src/data_files/numbers.txt");

        // open a file to write using output stream
        // the output stream will manage the files as binary files

        try {

            // You can create a file output stream using File object
            // FileOutputStream fileOut = new FileOutputStream(destinationFile);

            // You can create a file output stream using path to the file also
            FileOutputStream fileOut = new FileOutputStream("src/data_files/numbers.txt");

            int counter = 1 ;
            for (counter = 1 ; counter <= 100 ; counter++){
                fileOut.write(counter);
            }

            // close the destination file
            fileOut.close();

            // open the file using a FileInputStream to read
            FileInputStream fInput = new FileInputStream("src/data_files/numbers.txt");

            int valueFetched;
            while ( (valueFetched = fInput.read()) != -1 ){
                System.out.print( valueFetched + " ");
            }

            // close the source file
            fInput.close();


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
