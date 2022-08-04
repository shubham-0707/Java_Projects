
/*

In this question we have to calculate the power of a number up to a given number...

 */

package TCS_NQT_Striver_Sheet.Problems_on_Numbers;
import java.util.*;

public class power_of_a_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();
        System.out.println("Enter a : ");
        int a = sc.nextInt();


        /*

        Approach 1 : we can use a for loop untill a for n to calculate its power..

        Time Complexity : O(n)
        Space Complexity : O(1)

         */

        /*

        Approach 2 : Use inbuilt function to calculate power...

        Time Complexity : O(n)
        Space Complexity : O(1)

         */

        int pow = (int)Math.pow(n , a);
        System.out.println("The power of n uptill a is : "+pow);
    }
}
