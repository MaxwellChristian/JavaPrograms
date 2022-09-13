// Input a year and print the chinese year name

// formula : year divisible by 12
// 0 : monkey
// 1 : rooster
// 2 : dog
// 3 : pig
// 4 : rat
// 5 : ox
// 6 : tiger
// 7 : rabbit
// 8 : dragon
// 9 : snake
// 10 : horse
// 11 : sheep

// Note: the case are kept unordered to
// signify that the order is not mandatory and does not affect the logic

package conditional_constructs;

import java.util.Scanner;

public class ChineseYear {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter year: ");
        int year = input.nextInt();

        switch (year % 12) {
            case 0:
                System.out.println(year + " is year of Monkey");
                break;
            case 2:
                System.out.println(year + " is year of Dog");
                break;
            case 1:
                System.out.println(year + " is year of Rooster");
                break;
            case 4:
                System.out.println(year + " is year of Rat");
                break;
            case 3:
                System.out.println(year + " is year of Pig");
                break;
            case 5:
                System.out.println(year + " is year of Ox");
                break;
            case 6:
                System.out.println(year + " is year of Tiger");
                break;
            case 7:
                System.out.println(year + " is year of Rabbit");
                break;
            case 8:
                System.out.println(year + " is year of Dragon");
                break;
            case 9:
                System.out.println(year + " is year of Snake");
                break;
            case 10:
                System.out.println(year + " is year of Horse");
                break;
            case 11:
                System.out.println(year + " is year of Sheep");
                break;

        }

    }

}
