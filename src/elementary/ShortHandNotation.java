// +=
// -=
// *=
// /=
// %=

package elementary;

public class ShortHandNotation {

    public static void main(String[] args){

        int num1;
        int num2;
        int ans;

        num1 = 5;
        num2 = 2;

        ans = num1 + num2;
//        System.out.println("Answer for " + num1 + " + " + num2 + " : " + ans);

//        ans = ans + num2;
//        System.out.println("Answer after adding " + num2 + " : " + ans);
        ans += num2; // LEFT = LEFT + RIGHT i.e. ans = ans + num2
//        System.out.println("Answer after adding " + num2 + " : " + ans);

        num1 = num1 + 5;
        // num1 += 5;

        num2 = num2 - 10;
        // num2 -= 10;

        num1 = num1 * 5;
        // num1 *= 5;

        num2 = num2 % 2;
        // num2 %= 2;

        num2 = num2 - num1;
        // num2 -= num1 ;

        num1 = num1 + num2 - ans;
        // num1 = num1 + (num2 - ans);
        // num1 += (num2 - ans)

        num1 = num1 * num2 * ans;
        // num1 = num1 * (num2 * ans)
        // num1 *= (num2 * ans)

        num1 = num1 / num2 - ans - num1 ;
        // num1 /= (num2 - ans - num1)

        ans = ans + num1 * num2 % ans + num2 ;
        // ans += (num1 * num2 % ans + num2)

        num1 = 5;
        num2 = 2;
        ans = 0;

//        ans = ans + num1 ;
        ans += num1 ;
        System.out.println(ans);

//        ans = ans + (num1 / num2 - ans - num1) ;
//        ans += (num1 / num2 - ans - num1);
//        System.out.println(ans);

//        ans = ans + num1 * num2 % ans + num2;
        ans += (num1 * num2 % ans + num2);
        System.out.println(ans);

        ans = ans + ((num1 + num2) * num1 - ans) / num1 ;
        ans += ((num1 + num2) * num1 - ans) / num1 ;
    }

}
