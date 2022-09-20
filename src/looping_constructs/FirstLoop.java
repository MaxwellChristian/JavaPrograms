package looping_constructs;

// Write a program to print # 51 times

public class FirstLoop {

    public static void main(String [] args){

        int counter;

        // start point [only before you start i.e. only once]
        counter = 1;

        // check point [every time to move]
        while ( counter <= 5 ){
            System.out.print("#");

            // change point [every time you move]
            // should be inside the loop
            counter += 1;
        }



    }

}
