package io_file_handling;

// A JAVA program which takes a PATH in command line argument and
// checks whether the path points to a FILE or a DIRECTORY
// If it points to a directory then it displays full path of contents in the directory

import java.io.File;

public class FileDemo2 {

    public static void main(String []cmdArgs){

        if( cmdArgs.length == 0 ){
            System.out.println("Provide a path in command line argument");
        }
        else {

            String filePath = cmdArgs[0];

            File fileToWork = new File(filePath);

            // check whether the path exists or not
            if( fileToWork.exists() ){

                if( fileToWork.isFile() ){
                    System.out.println(filePath + ": is a FILE with size " + fileToWork.length());
                }
                else {
                    if( fileToWork.isDirectory() ){
                        File[] contentsOfDirectory = fileToWork.listFiles();
                        for (File currentFile: contentsOfDirectory) {
                            System.out.println(currentFile.getAbsolutePath());
                        }
                    }
                }

            }
            else {
                System.out.println( filePath + ": No such path exists");
            }

        }

    }

}
