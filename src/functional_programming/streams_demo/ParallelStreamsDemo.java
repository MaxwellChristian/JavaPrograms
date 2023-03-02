package functional_programming.streams_demo;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

// display the first FIVE smallest non-zero numbers from generated random numbers

public class ParallelStreamsDemo {

    public static void main(String []args){

        // generate few random numbers
        Random random = new Random();
        int []numbers = random.ints(500_000_000).toArray();

        int[] smallest5;
        long startTime;
        long endTime;

        // display the number of processors on the system
        System.out.println("Number of processors: " + Runtime.getRuntime().availableProcessors());

        // fetch the smallest FIVE non-zero numbers [sequential approach]
        startTime = System.currentTimeMillis();
        smallest5 = IntStream.of(numbers).filter(value -> value > 0).sorted().limit(5).toArray();
        endTime = System.currentTimeMillis();
        System.out.println("Smallest five non-zero numbers: " + Arrays.toString(smallest5));
        System.out.println("Processing time : " + (endTime-startTime) + " milliseconds");

        // fetch the smallest FIVE non-zero numbers [parallel approach]
        startTime = System.currentTimeMillis();
        smallest5 = IntStream.of(numbers).parallel().filter(value -> value > 0).sorted().limit(5).toArray();
        endTime = System.currentTimeMillis();
        System.out.println("Smallest five non-zero numbers: " + Arrays.toString(smallest5));
        System.out.println("Processing time : " + (endTime-startTime) + " milliseconds");

    }

}
