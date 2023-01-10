package io_file_handling;

import java.io.File;

public class FilePropertiesDemo {

    public static void main(String []args){

        File file = new File("src/data_files/data.txt");

        // check if the file exists
        if(file.exists()){

//            System.out.println();

            System.out.println("File exists");

            // display the size of the file
            System.out.println("File has: " + file.length() + " bytes");

            // check for the file type [directory]
            System.out.println("Is directory: " + file.isDirectory());

            // check for the file type [file]
            System.out.println("Is file: " + file.isFile());

            // check for readable file
            System.out.println("Is file [Readable]: " + file.canRead());

            // check for writable file
            System.out.println("Is file [Writable]: " + file.canWrite());

            // fetch the absolute path of file
            System.out.println("Absolute path of file: " + file.getAbsolutePath());
        }
        else {
            System.out.println("File does not exist at the given path");
        }

    }

}
