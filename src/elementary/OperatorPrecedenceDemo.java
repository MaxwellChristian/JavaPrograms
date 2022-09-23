// Write a program which can demonstrate the operator precedence and associativity

// Try to test the equation 3 + 4 * 4 > 5 * (4 + 3) – 1 && (4 – 3 > 5)
// just put this equation in println() or assign to an appropriate variable and print

// Operator precedence [top to bottom i.e. decreasing order]
// ++ and -- (postfix)
// Unary + and unary - ++ and -- (prefix)
// (type) casting operator
// !
// mathematical operators * / %
// mathematical operators + -
// relational operators < <= > >=
// equality == !=
// exclusive OR ^
// &&
// ||
// ?:
// assignment operators = += -= *= /= %=

package elementary;

public class OperatorPrecedenceDemo {

    public static void main(String[] args) {

        char x = 'A';
        double d = 5.8;
        String name = "JAVA";
        int h = 0XFFF4FF;


//        boolean equation = (3 + 4 * 4 > 5 * (4 + 3) – 1 && (4 – 3 > 5));

//        System.out.println(3 + 4 * 4 > 5 * (4 + 3) – 1 && (4 – 3 > 5));

        // 3 + 4 * 4 > 5 * (4 + 3) – 1

        // 3 + 4 * 4 -> 3 + 16 -> 19
        // 5 * (4 + 3) – 1 -> 5 * 7 - 1 -> 34
        // 19 > 24 -> false

        // 4 – 3 > 5
        // 1 > 5
        // false

        // false && false
        // false

    }

}
