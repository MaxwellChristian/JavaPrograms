// Input a year and check if it is a leap year
// Calculate Leap Year : Divisible by 4 but not by 100, OR is divisible by 400

package conditional_constructs;

import java.util.Scanner;

public class CheckLeapYear {

    public static void main(String[] args) {

        int year;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter year: ");
        year = input.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " : not a leap year");
        }
    }

}
