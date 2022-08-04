
/*
In this question we have to find the sum of numbers in a given range...
 */

package TCS_NQT_Striver_Sheet.Problems_on_Numbers;
import java.util.*;

public class sum_of_numbers_in_a_given_range {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a : ");
        int a = sc.nextInt();
        System.out.println("Enter b : ");
        int b = sc.nextInt();

        /*
        Approach 1 : use a for loop to calculate the sum of numbers from a to b

        Time Complexity : O(N)
        Space Complexity : O(1)
         */

        /*
        Approach 2 : In this approach we will subtract sum of 1 to a-1 from 1 to b

        Time Complexity : O(1)
        Space Complexity : O(1)

         */

        int sum = b*(b+1)/2 - a*(a-1)/2;
        System.out.println("The sum of the range : "+sum);


    }
}
