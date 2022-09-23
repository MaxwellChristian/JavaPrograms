/**
 *
 */
package conditional_constructs;

import java.util.Scanner;

/**
 * @author christianm
 */
public class LoginPinCheck {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // declaration section
        int pinByUser;

        // input section
        Scanner in = new Scanner(System.in);
        System.out.print("Enter you 4 digit pin: ");
        pinByUser = in.nextInt();

        // processing section

        // if construct : one way i.e only the TRUE part
        // if construct : two way i.e. both TRUE and FALSE part
        // [Only the FALSE part is optional]

        if (pinByUser == 1234) {
            // true part
            System.out.println("Welcome");
        } else {
            // false part [can be optional]
            System.out.println("Access denied");
        }

        // output section
        System.out.println("Completed checking the condition");

    }

}
