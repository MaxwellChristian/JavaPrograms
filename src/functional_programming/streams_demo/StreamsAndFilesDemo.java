package functional_programming.streams_demo;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamsAndFilesDemo {

    public static void main(String []args){

        // list all the unique words from a file

        // using streams

        try (Stream<String> lines = Files.lines(Paths.get("src/data_files/data.txt"), Charset.defaultCharset())) {
//            Stream<String> lines = Files.lines(Paths.get("data_files/data.txt"), Charset.defaultCharset());

            List<String> uniqueWords = lines.flatMap(line -> Arrays.stream(line.split(" ")))
                    .map(String::toUpperCase)
                    .distinct()
                    .sorted()
                    .toList();

            System.out.println(uniqueWords);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } {

        }

    }

}
