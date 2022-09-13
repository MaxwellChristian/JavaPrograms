package elementary;

public class DatatypeOperations {

    public static void main(String[] args){

        boolean bo = false;

        byte b = 1;
        char c = 'A';
        short s = 2;

        int i = 3;
        float f = 5.2f;

        long l = 4;
        double d = 8.9d;

//        c = c + b;
        System.out.println("c + b : " + (c + b));

         // l = (b + i + l + d); // Syntax error. Casting required to long
        // i = b + i + l + d; // Syntax error. Casting required to int
        // f = s + i + f + d; // Syntax error. Casting required to float

        f = i + f;
        System.out.println("i + f : " + f);

        d = b + i + l + d;
        System.out.println("b + i + l + d : " + d);

    }

}
