package functional_programming.streams_demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
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
            // first convert the stream of words to stream of characters
            // fetch the unique characters
            // display the characters

        keywords.stream()
                .map(word -> word.split(""))   // converts each word to an array of characters i.e. there exists multiple streams for each word4
                .flatMap(Arrays::stream)   // map each array to an single stream
                .distinct()
                .sorted()
                .forEach(System.out::print);

        System.out.println();
        System.out.println();

        // matching an occurrence

        // requirement : does any given text has the use of word "hello"
        String text = "Hey everybody. Welcome to the test of streams";
        List<String> listOfWords = Arrays.asList(text.split(" "));
        System.out.println(listOfWords);

        // anyMatch : checks for match of at least one element from stream
        if( listOfWords.stream().anyMatch(word -> word.equalsIgnoreCase("Hello")) ){
            System.out.println("Text contains 'Hello'");
        }
        else {
            System.out.println("Text misses 'Hello'");
        }

        // allMatch : can be used to check if all words in the text are same/keywords/of same length
        // noneMatch : opposite to all match

        // fetch a word from the text which has length more than 4
        // - needs to have a stream of words
        // - then check each word with length
        // - compare if the length is as per criteria
        // - only if it matches the criteria, then use/print
        listOfWords.stream()
                .filter(word -> word.length() >= 4)
                .findAny()  // findFirst() can also be used
                .ifPresent(System.out::println);

        // calculate the summation of numbers from a list

        // using the loop style
        int sum = 0 ; // 1. need to have a summation store initialised to ZERO
        for (int number: numbers){ // 2. iterate over each number from the list
            sum += number;  // 3. add the fetched number to the current summation value
        }
        System.out.println("Summation of " + numbers + " : " + sum);

        // using the stream style
//        int ans = numbers.stream().reduce(0, (s, n) -> s+n);    // s = s + n
        int ans = numbers.stream().reduce(0, Integer::sum);    // s = s + n
        System.out.println("Summation of " + numbers + " : " + ans);

//        numbers = new ArrayList<>();    // there are no numbers in the list
//        Optional<Integer> result = numbers.stream().reduce((s, n) -> s + n);    // s = s + n
//        Optional<Integer> result = numbers.stream().reduce(Integer::sum);    // s = s + n

        // finding minimum value from the number list
        numbers.stream().reduce(Integer::min);
        numbers.stream().reduce((v1, v2) -> v1 < v2 ? v1 : v2);

    }

}
