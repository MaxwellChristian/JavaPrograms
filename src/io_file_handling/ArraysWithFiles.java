package io_file_handling;

// storing and retrieving arrays [with files]

import java.io.*;
import java.util.Arrays;

public class ArraysWithFiles {
    public static void main(String []args){

        int []iValues = {1, 10, 57, 89, 98};
        String []sValues = {"ABC", "DEF", "GHI", "JKL", "MNO"};

        // store the int array and the string array to file

        // connect to the file
        File destinationFile = new File("src/data_files/array_files.dat");
        File sourceFile = new File("src/data_files/array_files.dat");

        // write the arrays using object stream
        try {

            // storing to files as objects
            ObjectOutputStream oOut = new ObjectOutputStream(new FileOutputStream(destinationFile));
            oOut.writeObject(iValues);
            oOut.writeObject(sValues);
            oOut.close();

            // reading from files as objects
            ObjectInputStream oIn = new ObjectInputStream(new FileInputStream(sourceFile));
            int []iValuesFetched = (int[]) oIn.readObject();
            String []sValuesFetched = (String[]) oIn.readObject();
            oIn.close();
            System.out.println("Int array fetched: " + Arrays.toString(iValuesFetched));
            System.out.println("String array fetched: " + Arrays.toString(sValuesFetched));
        } catch (IOException e) {
            System.out.print(e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.print(e.getMessage());
        }

    }
}
