
/*

In this program we have to check that the number is armstrong or not...

 */

package TCS_NQT_Striver_Sheet.Problems_on_Numbers;
import java.util.*;

public class check_if_a_number_is_armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;

        // converting to string to know the length...
        int l = Integer.toString(n).length();

        int sum = 0;

        while(n>0){
            int res = n%10;
            sum = sum + (int)Math.pow(res , l);
            n=n/10;
        }

        if(sum==temp){
            System.out.println("the number is armstrong");
            return;
        }
        System.out.println("The number is not an armstrong number");


        // Time Complexity : O(n)
        // Space Complexity : O(1)
    }
}
