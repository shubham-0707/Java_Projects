/*

In this question we have to find the sum of the given GP series...

 */


package TCS_NQT_Striver_Sheet.Problems_on_Numbers;
import java.util.*;

public class find_sum_of_GP_series {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a : ");
        int a = sc.nextInt();
        System.out.println("Enter r : ");
        int r = sc.nextInt();
        System.out.println("Enter n : ");
        int n = sc.nextInt();

        /*
        Approach 1 : In approach 1 we can follow a for loop to find the sum , at every iteration
        we can update the value of r..
         */

        /*
        Approach 2 : We can simply use the formula to find the sum of the GP series...
         */

        int sum = a*((int)Math.pow(r, n)-1)/(r-1);
        System.out.println("The sum of the GP series is as : "+sum);
    }
}
