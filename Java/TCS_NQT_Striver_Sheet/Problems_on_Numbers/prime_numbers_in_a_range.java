

/*

In this question prime numbers are found in a given range...

 */

package TCS_NQT_Striver_Sheet.Problems_on_Numbers;
import java.util.*;

public class prime_numbers_in_a_range {

    // Function to check for the prime..
    public static boolean isPrime(int n ){
        if(n==1)return false;

        for(int i=2 ; i<=Math.sqrt(n) ; i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter min : ");
        int min = sc.nextInt();
        System.out.print("Enter max : ");
        int max = sc.nextInt();

        for(int i=min ; i<=max ; i++){
            if(isPrime(i)){
                System.out.println(i+" ");
            }
        }
        // Time Complexity : O(n^1.5)
        // Space Complexity : O(1)
    }
}
