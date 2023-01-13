package io_file_handling;

import java.io.*;

public class ReadWriteUsingDataStream {

    public static void main(String[] args){

        // connect to the destination file
        File destinationFile = new File("src/data_files/student_records.txt");

        // connect to the source file
        File sourceFile = new File("src/data_files/student_records.txt");

        try {

            // connect the data output stream with the destination file
            // opens the file in write/output mode [not append, overwrite mode]
//            DataOutputStream dataOut = new DataOutputStream(new FileOutputStream(destinationFile));

            // connect the data output stream with the destination file
            // passing 'true' to the FileOutputStream constructor opens the file in 'append' mode
            DataOutputStream dataOut = new DataOutputStream(new FileOutputStream(destinationFile, true));

            // write the enrolment number
            dataOut.writeInt(1);

            // write the first name
            dataOut.writeUTF("Cameron");
            // write the middle name
            dataOut.writeUTF("J");
            // write the last name
            dataOut.writeUTF("Brown");

            // write the contact number
            dataOut.writeLong(3061110000L);

            // close the destination file
            dataOut.close();


            // connect the data input stream with the source file
            DataInputStream dataInput = new DataInputStream(new FileInputStream(sourceFile));

            // available() method returns the bytes available to read from the file
            // so when it returns ZERO (i.e., no more bytes to read), we have reached the end of the file
            while (dataInput.available() != 0){
                System.out.print(dataInput.readInt() + " ");
                System.out.print(dataInput.readUTF() + " ");
                System.out.print(dataInput.readUTF() + " ");
                System.out.print(dataInput.readUTF() + " ");
                System.out.print(dataInput.readLong() + " ");

                System.out.println();
            }

        } catch (FileNotFoundException e) {
            System.out.println("File does not exist : " + e.getMessage());
        } catch (IOException e) {
            System.out.println("File operation failed : " + e.getMessage());
        }

    }

}
