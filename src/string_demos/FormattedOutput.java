package string_demos;

public class FormattedOutput {

    public static void main(String[] args) {

        // formatted output for int
        System.out.printf("|%d|\n", 127891);
        System.out.printf("|%10d|\n", 127891);
        System.out.printf("|%010d|\n", 127891);

        System.out.println();

        // formatted output for decimals
        System.out.printf("|%f|\n", 12.2578925);
        System.out.printf("|%16f|\n", 12.2578925);
        System.out.printf("|%016f|\n", 12.2578925);
        System.out.printf("|%16.4f|\n", 12.2578925);
        System.out.printf("|%016.4f|\n", 12.2578925);

        // formatted output for scientific notation
        System.out.printf("|%e|\n", 12.2578925);
        System.out.printf("|%16e|\n", 12.2578925);
        System.out.printf("|%016e|\n", 12.2578925);
        System.out.printf("|%16.4e|\n", 12.2578925);
        System.out.printf("|%016.4e|\n", 12.2578925);

        // formatted output for characters
        System.out.printf("%c\n", 65);
        System.out.printf("%c\n", 'a');
        System.out.printf("|%5c|\n", 'a');

        // formatted output for string
        System.out.printf("|%s|\n", "Hello");
        System.out.printf("|%20s|\n", "Hello");

        // specifying width with left alignment using -
        System.out.printf("|%-20s|\n", "Hello");


    }

}
