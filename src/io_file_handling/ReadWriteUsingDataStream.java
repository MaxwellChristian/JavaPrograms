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
            DataOutputStream dataOut = new DataOutputStream(new FileOutputStream(destinationFile));

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

            System.out.println("Enrolment number: " +  dataInput.readInt());
            System.out.println("First name: " +  dataInput.readUTF());
            System.out.println("Middle name: " +  dataInput.readUTF());
            System.out.println("Last name: " +  dataInput.readUTF());
            System.out.println("Contact number: " +  dataInput.readLong());

        } catch (FileNotFoundException e) {
            System.out.println("File does not exist : " + e.getMessage());
        } catch (IOException e) {
            System.out.println("File operation failed : " + e.getMessage());
        }

    }

}
