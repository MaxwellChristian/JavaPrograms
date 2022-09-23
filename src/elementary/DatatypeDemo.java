package elementary;

public class DatatypeDemo {

    public static void main(String[] args) {

        char c = 'A';
        boolean bo = false;

        byte b = 0;
        short s = 0;
        int i = 0;
        long l = 0;

        float f = 0;
        double d = 0;


        // byte
        System.out.print("byte : ");
        System.out.print("(SIZE: " + Byte.SIZE + ")" + ", ");
        System.out.print("(MIN: " + Byte.MIN_VALUE + ")" + ", ");
        System.out.print("(MAX: " + Byte.MAX_VALUE + ")" + "");
        System.out.println();

        // char
        System.out.print("char : ");
        System.out.print("(SIZE: " + Character.SIZE + ")" + ", ");
        System.out.print("(MIN: " + Character.MIN_VALUE + ")" + ", ");
        System.out.print("(MAX: " + Character.MAX_VALUE + ")" + "");
        System.out.println();

        // short
        System.out.print("short : ");
        System.out.print("(SIZE: " + Short.SIZE + ")" + ", ");
        System.out.print("(MIN: " + Short.MIN_VALUE + ")" + ", ");
        System.out.print("(MAX: " + Short.MAX_VALUE + ")" + "");
        System.out.println();

        // int
        System.out.print("int : ");
        System.out.print("(SIZE: " + Integer.SIZE + ")" + ", ");
        System.out.print("(MIN: " + Integer.MIN_VALUE + ")" + ", ");
        System.out.print("(MAX: " + Integer.MAX_VALUE + ")" + "");
        System.out.println();

        // float
        System.out.print("float : ");
        System.out.print("(SIZE: " + Float.SIZE + ")" + ", ");
        System.out.print("(MIN: " + Float.MIN_VALUE + ")" + ", ");
        System.out.print("(MAX: " + Float.MAX_VALUE + ")" + "");
        System.out.println();

        // long
        System.out.print("long : ");
        System.out.print("(SIZE: " + Long.SIZE + ")" + ", ");
        System.out.print("(MIN: " + Long.MIN_VALUE + ")" + ", ");
        System.out.print("(MAX: " + Long.MAX_VALUE + ")" + "");
        System.out.println();

        // double
        System.out.print("double : ");
        System.out.print("(SIZE: " + Double.SIZE + ")" + ", ");
        System.out.print("(MIN: " + Double.MIN_VALUE + ")" + ", ");
        System.out.print("(MAX: " + Double.MAX_VALUE + ")" + "");
        System.out.println();

        // boolean
        System.out.print("boolean : ");
        System.out.print("(SIZE: " + "Not precisely defined" + ")" + ", ");
        System.out.print("(False: " + Boolean.FALSE + ")" + ", ");
        System.out.print("(True: " + Boolean.TRUE + ")" + "");
        System.out.println();

    }

}
