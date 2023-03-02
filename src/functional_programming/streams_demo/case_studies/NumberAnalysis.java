package functional_programming.streams_demo.case_studies;

// display count of all the numbers that are larger than the average of all numbers provided

// modify the program where it takes the double values from command line arguments


import java.util.stream.DoubleStream;

public class NumberAnalysis {

    public static void main(String []args){

        // series of double values
        double []doubleValues = {10, 90, -87, 99, 198.78, 1.579} ;

        // average of the double values provided
        double averageValue = DoubleStream.of(doubleValues).average().getAsDouble();

        // count of numbers larger than the average value
        long totalValuesLargerThanAverage = DoubleStream.of(doubleValues).filter(value -> value > averageValue).count();

        System.out.println("Average: " + averageValue);
        System.out.println("Total values larger than average: " + totalValuesLargerThanAverage);


    }

}
