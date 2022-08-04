/*
In this question we have to find the sum of the digits of a number
 */

package TCS_NQT_Striver_Sheet.Problems_on_Numbers;
import java.util.*;

public class sum_of_digits_of_a_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum = 0;

        while(n>0){
            sum+=n%10;
            n/=10;
        }
        System.out.println("The sum of the digits of the number is : "+sum);

        // Time Complexity : O(N) where N is the number of digits in the number.
        // Space Complexity : O(1)
    }
}
