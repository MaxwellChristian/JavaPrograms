package io_file_handling;

// copy data of a source file to destination file

import java.io.*;

public class CopyFileDataUsingBufferedStream {

    public static void main(String []args){

        // open a file in read mode

        // open another file in write mode

        // copy data from source file to destination file
            // it means copying all bytes from source to destination
            // so far we have only read byte by byte
            // but copying byte-by-byte is quite time-consuming
            // this can be speed up by copying a chunk of bytes
            // this can be achieved using buffered streams

        File sourceFile = new File("src/data_files/student_records.txt");
        File destinationFile = new File("src/data_files/student_records_copy.txt");

        try {

            // create the buffered inout stream to read some bytes
            BufferedInputStream bufferedIn = new BufferedInputStream(new FileInputStream(sourceFile));

            // create the buffered output stream to copy some amount of bytes [the bytes read from source file]
            BufferedOutputStream bufferedOut = new BufferedOutputStream(new FileOutputStream(destinationFile));

            int totalIterations = 0;
            int totalBytesCopied = 0;
            int fetchedByte;
            while (( fetchedByte = bufferedIn.read() )!=-1){
                bufferedOut.write(fetchedByte);
                totalBytesCopied++;
                totalIterations++;
            }

            System.out.println(totalBytesCopied + ": bytes copied");
            System.out.println(totalIterations + ": iterations performed");

            // close the out file
            bufferedOut.close();

            // close the in file
            bufferedIn.close();

        } catch (FileNotFoundException e) {
            System.out.println("File does not exist: " + e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
