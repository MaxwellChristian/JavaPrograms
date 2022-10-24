
/*
 *
 * Write a JAVA program which inputs 10 different numbers (with decimals) and then
 *   - displays the average of all numbers
 *   - count of all such numbers which are larger than average
 *   - count of all such numbers which are larger than difference of maximum number and minimum number
 *   - display the maximum number
 *   - display the minimum number
 *
 * Implement user defined methods where ever required
 * */

package array;

import java.util.Arrays;
import java.util.Random;

public class NumberAnalyzer {


    private static final int SMALLER = 0;
    private static final int LARGER = 1;

    public static void main(String[] args) {

        // declaration
        double[] values;
        double maximumValue;
        double minimumValue;
        double averageValue;
        int count;

        // input
        values = getArrayWithRandomValues(10, 100);

        // processing
        maximumValue = getMaximum(values);
        minimumValue = getMinimum(values);
        averageValue = getAverage(values);

        // output

        // display the values from array
        System.out.println(Arrays.toString(values));

        // display the Maximum
        System.out.println("Maximum value: " + maximumValue);

        // display the Minimum
        System.out.println("Minimum value: " + minimumValue);

        // display the Average
        System.out.println("Average value: " + averageValue);

        // Display count of values larger than average value
        count = countComparing(values, averageValue, NumberAnalyzer.LARGER);
        System.out.println("Values larger than " + maximumValue + " : " + count);

        // Display count of values larger than difference of maximum and minimum value
        count = countComparing(values, maximumValue - minimumValue, NumberAnalyzer.LARGER);
        System.out.println("Values larger than (max and min difference) " + (maximumValue-minimumValue) + " : " + count);


    }

    private static int countComparing(double[] values, double comparingValue, int comparison) {

        int count = 0;

        for (double currentValue :
                values) {

            switch (comparison) {
                case LARGER:
                    if (currentValue > comparingValue) {
                        count++;
                    }
                    break;
                case SMALLER:
                    if (currentValue < comparingValue) {
                        count++;
                    }
                    break;
            }

        }

        return count;
    }

    private static double getAverage(double[] values) {

        double averageValue = 0;

        for (double currentValue : values) {
            averageValue += currentValue;
        }

        return averageValue / values.length;
    }

    private static double getMaximum(double[] values) {
        double maximumValue = values[0];

        for (double value :
                values) {
            if (value > maximumValue) {
                maximumValue = value;
            }
        }

        return maximumValue;
    }

    private static double getMinimum(double[] values) {
        double minimumValue = values[0];

        for (double currentValue :
                values) {
            if (currentValue < minimumValue) {
                minimumValue = currentValue;
            }
        }

        return minimumValue;
    }

    private static double[] getArrayWithRandomValues(int noOfValues, int maxValue) {

        double[] values = new double[noOfValues];

        for (int index = 0; index < values.length; index++) {
            values[index] = new Random().nextDouble(maxValue);
        }

        return values;
    }

}
