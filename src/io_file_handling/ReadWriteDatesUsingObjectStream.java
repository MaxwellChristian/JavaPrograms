package io_file_handling;

import java.io.*;
import java.util.Date;

public class ReadWriteDatesUsingObjectStream {

    public static void main(String []args){

        // Connect the file to store the date
        File destinationFile = new File("src/data_files/date_records.txt");

        try {
            // object output stream to store the data as and of objects
            ObjectOutputStream objectOut = new ObjectOutputStream(new FileOutputStream(destinationFile));

            // writing the whole object (instead of parts/members of the object)
            objectOut.writeObject(new Date());

            // close the destination file
            objectOut.close();

            // object input stream to read data from file in objects
            ObjectInputStream objectIn = new ObjectInputStream(new FileInputStream(destinationFile));

            // read the content of the file and store in appropriate object
            // as we know that we are fetching a DATE from file,
            // we need to type cast the fetched object to DATE
            Date dateFetchedFromFile = (Date) objectIn.readObject();

            // close the file
            objectIn.close();

            // display the fetched DATE from file
            System.out.println(dateFetchedFromFile);

        } catch (IOException e) {
            System.out.println("File handling failed: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }

    }

}
