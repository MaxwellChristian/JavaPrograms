package methods;

public class MultiArgumentDemo {

    public static void main(String []args){

        // call a method which takes
            // - a string parameter
            // - followed by an integer parameter
            // - followed by multiple boolean parameters

        // fn1( "word1", 78, true, false, true, true );
        fn1("word1", 78, true, false, true, true);

    }

    private static void fn1(String word, int iNumber, boolean ...bValues) {
        System.out.println("String parameter 1 : " + word);
        System.out.println("int parameter 2 : " + iNumber);
        int ctr = 1;
        for (boolean b: bValues){
            System.out.printf("Boolean parameter %d : " + b, ctr++);
            System.out.println();
        }
    }

//    private static void fn1(String word1, int i, boolean b, boolean b1, boolean b2, boolean b3) {
//    }



}
