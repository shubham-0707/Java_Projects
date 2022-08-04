/*

In this question we have to find the sum of first n natural numbers...

 */

package TCS_NQT_Striver_Sheet.Problems_on_Numbers;
import java.util.*;

public class sum_of_first_n_natural_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum = 0;

        /*
        Approach 1 : In this approach we will traverse from 1 to that number to find the sum...
        Time Complexity : O(n)
        Space Complexity: O(1)
         */

        /*
        Approach 2 : we will use the mathematical formula i.e. n*(n+1)/2;
        Time Complexity : O(1)
        Space Complexity : O(1)
         */

        sum = n*(n+1)/2;
        System.out.println("The sum of first n natural numner is : "+sum);

    }
}
