
/*

In this question we have to check if a number is a palindrome or not...

 */

package TCS_NQT_Striver_Sheet.Problems_on_Numbers;
import java.util.*;

public class check_for_a_palindrome_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

       // storing the number in a variable ..

        int temp = n ;

        // checking for a palindrome number ..

        int sum = 0;
        while(n>0){
            int res = n%10;
            sum=sum*10 + res;
            n=n/10;
        }

        if(sum==temp){
            System.out.println("The number is a palindrome");
            return;
        }
        System.out.println("The number is not a palindrome");

        // Time Complexity : O(N)
        // Space Complexity : O(1)
    }
}
