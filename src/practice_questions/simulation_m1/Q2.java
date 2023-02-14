package practice_questions.simulation_m1;

import java.io.File;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class Q2 {

    public static void main(String []args){

        // add your code here to test the functionality of the method defined below
        System.out.println(findStartingWith("C:\\Users\\christianm\\IdeaProjects\\JavaPrograms\\src", "Q"));

    }

    public static ArrayList<File> findStartingWith(String sDirectoryPath, String sPattern) {

        // add your code here to complete the requirement
        ArrayList<File> listToReturn = new ArrayList<>();

        // point to the directory path
        File pathToWork = new File(sDirectoryPath);

        // check if it exists
        if( pathToWork.exists() ){

            // check if it is directory
            if( pathToWork.isDirectory() ){

                // check if directory has contents

                // iterate on each content of the directory
                for (File file : Objects.requireNonNull(pathToWork.listFiles())) {
                    listToReturn.addAll(findStartingWith(file.getAbsolutePath(), sPattern));
                }

            }
            else {
                // check if the name starts with the desired pattern
                if( pathToWork.getName().startsWith(sPattern) ){
                    listToReturn.add(pathToWork);
                }
            }

        }


        return listToReturn;
    }

}
