package recursion;

public class SumValues {

    public static void main(String []args){

        int ans;

        ans = sumValues(4);
        System.out.println(ans);

        ans = sumValuesR(4);
        System.out.println(ans);

    }

    private static int sumValuesR(int n) {

        if( n > 1 ){
            return n + sumValues(n-1);
        }

        return 1;
    }

    private static int sumValues(int n) {

        int sum = 0 ;
        for( ; n >= 1 ; n-- ){
            sum += n;
        }

        return sum;
    }

}
