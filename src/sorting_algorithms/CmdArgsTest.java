package sorting_algorithms;

public class CmdArgsTest {

    public static void main(String []args) {

        // String []values = { "how", "are", "you" };

        if( args.length != 0 ){

            for (String curArg: args) {
                System.out.println(curArg);
            }

        }
        else {
            System.out.println("Pass cmd line args");
        }

    }

}
