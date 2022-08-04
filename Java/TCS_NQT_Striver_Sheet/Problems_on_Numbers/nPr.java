/*
In this question we have to find the permutation of a number at a given r value...
 */

package TCS_NQT_Striver_Sheet.Problems_on_Numbers;
import java.util.*;

public class nPr {
    public static int fact(int n){
        if(n==0){
            return 1;
        }
        return n*fact(n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();
        System.out.println("Enter r : ");
        int r = sc.nextInt();

        int perm = fact(n)/fact(n-r);

        System.out.println("The permutations possible are : "+perm);


        // Time Complexity : O(N)
        // Space Complexity : O(1)

        /*
        Approach 2 : In this approach we will multiply recursively from n for a count to r..

        Time Complexity : O(N)
        Space Complexity : O(1)
         */
    }
}
