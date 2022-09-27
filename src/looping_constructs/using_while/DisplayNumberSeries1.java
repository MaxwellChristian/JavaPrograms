
// Display a series of numbers from 1 to 100 in the same line

package looping_constructs.using_while;

public class DisplayNumberSeries1 {

    public static void main(String[] args){

        int counter ;

        System.out.println("Now the value print will start");

        // start point
        counter = 1;

        // check point
        while (counter <= 100) {

            // System.out.println(counter);
            // display the value of counter and then a new line

            System.out.print(counter + " ");

            // change point
            counter++;

            // or : counter += 1
            // or : counter = counter + 1
            // or : ++counter
        }

        System.out.println("\nThe value print has completed");

    }

}
