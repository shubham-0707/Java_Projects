
/*
In this question we have to find the prime factorisation of a number...
 */

package TCS_NQT_Striver_Sheet.Problems_on_Numbers;
import java.util.*;

public class print_prime_factorisation_of_a_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=2 ; i<=n ; i++){
            while(n%i==0 && n>1){
                System.out.print(i+" , ");
                n=n/i;
            }
        }

        // Time Complexity : O(n^2)
        // Space Complexity : O(1)
    }
}
