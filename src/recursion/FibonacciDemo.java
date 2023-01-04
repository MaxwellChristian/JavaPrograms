package recursion;

public class FibonacciDemo {

    public static void main(String []args){

        long ans;

        ans = fibo1(8);
        System.out.println(ans);

        ans = fiboR(8);
        System.out.println(ans);

    }

    private static long fiboR(int n) {
        if (n == 0) // Base case
            return 0;
        else if (n == 1) // Base case
            return 1;
        else  // Reduction and recursive calls
            return fiboR(n - 1) + fiboR(n - 2);

    }

    private static long fibo1(int n) {
        long f0 = 0; // For fib(0)
        long f1 = 1; // For fib(1)
        long f2 = 1; // For fib(2)

        if (n == 0)
            return f0;
        else if (n == 1)
            return f1;
        else if (n == 2)
            return f2;

        for (int i = 3; i <= n; i++) {

            f0 = f1;
            f1 = f2;
            f2 = f0 + f1;

        }

        return f2;

    }

}
