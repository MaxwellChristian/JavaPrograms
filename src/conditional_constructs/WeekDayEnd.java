
// Write a program which takes day number and displays whether that day is a WEEKDAY or WEEKEND

package conditional_constructs;

import java.util.Scanner;

public class WeekDayEnd {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter day number: ");
        int dayNumber = input.nextInt();

        switch (dayNumber) {
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Week day");
                break;
            case 6:
            case 7:
            case 1:
                System.out.println("Week end");
                break;
            default:
                System.out.println("Day number must be between 1 and 7");
        }

    }

}
