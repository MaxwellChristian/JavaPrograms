package io_file_handling;

import java.io.*;

public class UserDefinedObjectsWithFiles {
    public static void main(String []args){

        // user-defined object
        Student s1 =new Student();
        s1.setEnrolmentNumber("E1");
        s1.setFirstName("Maxwell");
        s1.setMiddleName("G");
        s1.setMiddleName("Christian");

        s1.setNickNames(new String[]{"Max"});

        // destination file to store the user-defined object
        File destinationFile = new File("src/data_files/student_object_records.txt");
        File sourceFile = new File("src/data_files/student_object_records.txt");

        try {
            // object storage to file
            ObjectOutputStream oOut = new ObjectOutputStream(new FileOutputStream(destinationFile));
            // if user-defined object is to be stored in file, that object must be 'serializable'
            oOut.writeObject(s1);
            oOut.close();

            // object fetching from file
            ObjectInputStream oIn = new ObjectInputStream(new FileInputStream(sourceFile));
            Student studentObjectFetched = (Student) oIn.readObject();
            oIn.close();
            System.out.println(studentObjectFetched);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
