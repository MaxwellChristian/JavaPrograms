package functional_programming.streams_demo.case_studies;

// using streams display the occurrence of each character in a text

// modify to fetch the text from command line argument

import java.util.Arrays;
import java.util.List;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CounterFromText {

    public static void main(String[] args) {

        Arrays.stream(args)



        ;

        "Welcome".chars().mapToObj(value -> (char) value)
                .filter(Character::isLetter)
                .map(Character::toUpperCase)
                .collect(Collectors.groupingBy(character -> character, TreeMap::new, Collectors.counting()))
                .forEach((character, count) -> {
                    System.out.println(character + " : " + count);
                });


    }

}
