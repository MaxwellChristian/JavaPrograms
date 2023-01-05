
// The following implementation works well only with positive numbers

package sorting_algorithms;

import array.utilities.ArrayUtilities;
import java.util.ArrayList;
import java.util.Iterator;

public class BucketSortDemo {

    public static void main(String []args){

        int []values = {19, 9, 197, -9, 47, 11, 10};

        ArrayUtilities.printValues(values);
        System.out.println();

        bucketSort(values);

        ArrayUtilities.printValues(values);
        System.out.println();

    }

    private static void bucketSort(int[] values) {

        int radixToWork = 10;

        // find the maximum value to determine the iterations
        int maxValue = findMaximum(values);
//        System.out.println("Max value: " + maxValue);

        // calculate the total number of digits from max value
        int totalIterations = countDigits(maxValue);
//        System.out.println("Total iterations: " + totalIterations);

        ArrayList<ArrayList<Integer>> bins = new ArrayList<>();
        for( int counter = 0 ; counter < radixToWork ; counter++ ){
            bins.add(new ArrayList<Integer>());
        }

        int divisor = 1;
        for( int counter = 0 ; counter < totalIterations ; counter++ ){

            // add each value [as per digit] to correct bin
            for (int currentValue: values ) {
                int dig = (currentValue/divisor)%radixToWork;
                bins.get(dig).add(currentValue);
            }

            divisor*=10;

//            for(ArrayList<Integer> bin: bins){
//                System.out.print(counter + " : ");
//                System.out.println(bin);
//            }

            // copy to array
            int destIndex = 0;
            for(ArrayList<Integer> bin: bins){
                for (Iterator<Integer> it = bin.iterator(); it.hasNext(); ) {
                    int value = it.next();
                    values[destIndex++] = value;
                }

                // clear the bin that was copies
                bin.clear();
            }
//            System.out.println(values);

        }

    }

    private static int countDigits(int value) {
        int counter = 0 ;
        while(value>0){
            value/=10;
            counter++;
        }
        return counter;
    }

    private static int findMaximum(int[] values) {
        int max = values[0];
        for (int current: values){
            if( current > max ){
                max = current;
            }
        }
        return max;
    }

}
