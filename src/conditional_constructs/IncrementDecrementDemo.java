// Write a program to demonstrate use of increment and decrement operators

// ++ : increment
// -- : decrement

// two versions : postfix and prefix
// postfix : var++ or var--
// prefix : ++var or --var

package conditional_constructs;

public class IncrementDecrementDemo {

    public static void main(String[] args){

        int x;
        int y;
        int z;

        x = 5;


//        x = x + 1;
//        System.out.println("x : " + x);

//        x++; // can be used only if value is to be incremented by 1
//        System.out.println("x : " + x);

//        ++x; // can be used only if value is to be incremented by 1
//        System.out.println("x : " + x);

        x = 5;
        System.out.println("x : " + x);

        // y = x++;
        // y = x
        // x += 1

        y = x++ ; // x++ here ++ is after x and hence known as postfix
        // when postfix
            // step 1: it first assigns x to y
            // step 2: and then increments x by 1
        System.out.println("y = x++ -> y : " + y);
        System.out.println("x : " + x);

        System.out.println("--------------------");

        x = 5;
        System.out.println("x : " + x);

//        y = ++x;
//        x += 1;
//        y = x;

        y = ++x ; // ++x here ++ is before x and hence known as prefix
        // when prefix
        // step 1: it first increments x by 1
        // step 2: and then assigns x to y
        System.out.println("y = ++x -> y : " + y);
        System.out.println("x : " + x);
        System.out.println("--------------------");


        x = 5;
        System.out.println("x : " + x);
        y = x--;
        System.out.println("y = x-- -> y : " + y);
        System.out.println("x : " + x);
        System.out.println("--------------------");

        x = 5;
        System.out.println("x : " + x);
        y = --x;
        System.out.println("y = --x -> y : " + y);
        System.out.println("x : " + x);
        System.out.println("--------------------");

        x = 5;
        System.out.println("x : " + x);
        y = x++ + x++;
        System.out.println("y = x++ + x++ -> y : " + y);
        System.out.println("x : " + x);
        System.out.println("--------------------");

        x = 5;
        System.out.println("x : " + x);
        y = x++ + ++x;
        System.out.println("y = x++ + ++x -> y : " + y);
        System.out.println("x : " + x);
        System.out.println("--------------------");

        x = 0;
        y = 0;
        x += y = y+5;

        x += y += 5;

        x += 5 + y++ ;
        // x = x + (5 + y++);
        // x : 5
        // y : 1

        x += 5 + ++ y;
        // x = x + ( 5 + ++y);
        // x : 6
        // y : 1

    }

}
