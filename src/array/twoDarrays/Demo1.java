package array.twoDarrays;

import java.util.Random;
import java.util.Scanner;

public class Demo1 {

    private static final int TOTAL_WORKING_DAYS_IN_A_WEEK = 5;
    private static final int TOTAL_STUDENTS = 2;

    public static void main(String []args){

        // declare a 2D array
        int [][]values = new int[3][5];

        int [][]attendance = new int[TOTAL_STUDENTS][TOTAL_WORKING_DAYS_IN_A_WEEK];

        Scanner input = new Scanner(System.in);

        int studentCounter ;
        int dayCounter ;
        for( studentCounter = 0 ; studentCounter < TOTAL_STUDENTS ; studentCounter++ ){

            for( dayCounter = 0 ; dayCounter < TOTAL_WORKING_DAYS_IN_A_WEEK ; dayCounter++ ){

//                System.out.printf("Enter student %d for day %d: \n", studentCounter, dayCounter);
//                attendance[studentCounter][dayCounter] = input.nextInt();

                attendance[studentCounter][dayCounter] = Math.abs(new Random().nextInt()%2) ;
            }

        }

        printAttendance(attendance);

    }

    private static void printAttendance(int[][] attendance) {

        int d1;
        int d2;

        for(d1 = 0 ; d1 < attendance.length ; d1++){
//            System.out.println(d1); // this will be as per first dimension

            for( d2 = 0 ; d2 < attendance[d1].length ; d2++ ){
                System.out.printf("Student[%d] Day[%d]: %d\n", d1, d2, attendance[d1][d2]);
            }
        }

    }

}
