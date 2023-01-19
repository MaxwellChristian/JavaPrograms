package generics_demos;

// Write a program which can read a text file and
// count the occurrence of each word in that file

// the path of the text file should be passed from command line argument
// when not passed using command line argument, prompt the user to input the file path

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountWordOccurrences {

    public static void main(String []args){

        // fetch the file path from command line arguments

        String filePath;
        if( args.length == 0 ){
            // if not available, prompt the user to enter the file path
            Scanner input = new Scanner(System.in);
            System.out.print("Enter file path : ");
            filePath = input.nextLine();
        }
        else {
            filePath = args[0];
        }

        // create instance of the file
        File sourcefile = new File(filePath);

        try {
            Scanner fileScanner = new Scanner(sourcefile);

            // the map to store the word and its occurrence count
            Map<String, Integer> wordMap = new TreeMap<>();

            // read the contents of the file word by word [each token]
            while (fileScanner.hasNext()){
                String word = fileScanner.next();

                // check if the word has already been encountered
                if( ! wordMap.containsKey(word) ){
                    wordMap.put(word, 1);
                    // if not encountered, add to the list of words with count as 1
                }
                else {
                    // if encountered, increment the count
                    int count = wordMap.get(word);
                    wordMap.put(word, count+1);
                }
            }

            // display the occurrences
            wordMap.forEach( (word, count) -> {
                System.out.println(word + " : " + count);
            });

            fileScanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }



    }

}
