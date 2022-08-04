
/*
In this question we have to find the maximum and minimum digit in a number...
 */


package TCS_NQT_Striver_Sheet.Problems_on_Numbers;
import java.util.*;



public class maximum_and_minimum_digit_in_a_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();


        int mini = Integer.MAX_VALUE;
        int maxi = Integer.MIN_VALUE;

        while(n>0){
            maxi = Math.max(maxi , n%10);
            mini = Math.min(mini , n%10);
            n=n/10;
        }

        System.out.println("The smallest digit is : "+mini);
        System.out.println("The greatest digit is : "+maxi);

        // Time Complexity : O(N)
        // Space Complexity : O(1)
    }
}
