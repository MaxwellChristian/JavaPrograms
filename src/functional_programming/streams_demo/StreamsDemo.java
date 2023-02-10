package functional_programming.streams_demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsDemo {

    public static void main(String []args){

        // create a list of numbers using Arrays
        List<Integer> numbers = Arrays.asList(10, 20, 30, 11, 22, 30, 99, 98, 97, 20);

        // fetch all the numbers that are in multiple of 5
        // the fetches list must contain unique numbers only

        // steps
        // create a stream
        //  filter as per criteria
        //  fetch unique
        //  display the matching

        List<Integer> numbersDivisibleBy5 = numbers.stream()
                .filter(val -> val % 5 == 0)  // stream intermediate operations
                .distinct()
                .collect(Collectors.toList());  // stream terminal operations

        System.out.println(numbersDivisibleBy5);

        // demonstrating another terminal operation
        long totalNumbersDivisibleBy5 = numbers.stream()
                .filter(val -> val % 5 == 0)  // stream intermediate operations
                .distinct()
                .count();  // stream terminal operations
        System.out.println("Total numbers divisible by 5: " + totalNumbersDivisibleBy5);

        // demonstrating one more terminal operation
        numbers.stream()
                .filter(val -> val % 5 == 0)  // stream intermediate operations
                .distinct()
                .forEach(System.out::println);  // stream terminal operations

        List<String> keywords =
                Arrays.asList("break", "if", "else", "class", "interface", "class", "extends", "implements");

        // display the length of each keyword
        keywords.stream()
                .distinct()
                .map(String::length)
                .forEach(System.out::println);

        // display the unique characters used by all keywords


    }

}
