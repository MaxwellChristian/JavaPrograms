package mathlibrary;

public class MathMinMaxAbs {

    public static void main(String[] args) {

        System.out.println("Math.max(2, 3): " + Math.max(2, 3));
        System.out.println("Math.min(2.5, 3.6): " + Math.min(2.5, 3.6));
        System.out.println("Math.max(Math.max(2.5, 4.9), Math.min(3.2, 5.2)): " + Math.max(Math.max(2.5, 4.9), Math.min(3.2, 5.2)));

        System.out.println();

        System.out.println("Math.abs(-2): " + Math.abs(-2));
        System.out.println("Math.abs(-2.8): " + Math.abs(-2.8));
        System.out.println("Math.abs(2-5): " + Math.abs(2 - 5));

        System.out.println();

        System.out.println("Max of 5 and 7: " + Math.max(5, 7));
        System.out.println("Max of 5, 7, 9: " + Math.max(5, Math.max(7, 9)));

    }

}
