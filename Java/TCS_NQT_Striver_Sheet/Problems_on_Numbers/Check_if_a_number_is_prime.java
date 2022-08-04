
/*

In this question we have to check that a number is prime or not...

 */

package TCS_NQT_Striver_Sheet.Problems_on_Numbers;
import java.util.*;

public class Check_if_a_number_is_prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n==1){
            System.out.println("The number is not prime");
            return;
        }

        //checking that a number is prime or not..

        for(int i=2 ; i<Math.sqrt(n) ; i++){
            if(n%i==0){
                System.out.println("The number is not prime");
                return;
            }
        }

        System.out.println("The number is prime");

        // Time Complexity : O(sqrt(n))
        // Space Complexity : O(1)
    }
}
