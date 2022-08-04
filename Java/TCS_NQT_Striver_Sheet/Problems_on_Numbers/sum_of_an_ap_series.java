
/*

In this question we have to find the sum of an ap series...

 */

package TCS_NQT_Striver_Sheet.Problems_on_Numbers;
import java.util.*;

public class sum_of_an_ap_series {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a : ");
        int a = sc.nextInt();
        System.out.println("Enter n : ");
        int n = sc.nextInt();
        System.out.println("Enter d : ");
        int d = sc.nextInt();


        /*
        Approach 1 : In this approach we can find sum of the ap series by finding the elements of the series...

        // Time Complexity : O(N)
        // Space Complexity : O(1)
         */

        /*

        Approach 2 : We will use the A.P. sum formula to calculate the sum of the AP
        Time Complexity : O(1)
        Space Complexity : O(1)

         */

        int sum = n*(2*a +(n-1)*d)/2;
        System.out.println("The sum of the given A.P. series is : "+sum);


    }

}
