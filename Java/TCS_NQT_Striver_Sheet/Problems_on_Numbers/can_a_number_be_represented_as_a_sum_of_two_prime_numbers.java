
/*
In this program we have to check that a number can be represented as a sum of two prime number or not...
 */

package TCS_NQT_Striver_Sheet.Problems_on_Numbers;
import java.util.*;

public class can_a_number_be_represented_as_a_sum_of_two_prime_numbers {

    public static boolean isPrime(int n){
        if(n==1){
            return false;
        }

        for(int i=2 ; i<=Math.sqrt(n) ; i++){
            if(n%i==0){
                return false;
            }
        }

        return true;
    }

    public static boolean check(int n){

        for(int i=2 ; i<=n/2 ; i++){
            if(isPrime(i) && isPrime(n-i)){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();

        System.out.println(check(n));

        // Time Complexity : O(n^2)
        // Space Complexity : O(1)
    }
}
