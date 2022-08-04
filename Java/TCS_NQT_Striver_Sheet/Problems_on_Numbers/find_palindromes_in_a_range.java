

/*

In this question we have to find the palindrome numbers in a given range...

 */

package TCS_NQT_Striver_Sheet.Problems_on_Numbers;
import java.util.*;

public class find_palindromes_in_a_range {

    public static boolean isPalindrome(int n){
        int sum = 0;
        int temp = n;

        while(n>0){
            int res = n%10;
            sum = sum*10+res;
            n=n/10;
        }

        return sum==temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter min : ");
        int min = sc.nextInt();
        System.out.print("Enter max : ");
        int max = sc.nextInt();

        for(int i=min ; i<=max ; i++){
            if(isPalindrome(i)){
                System.out.print(i+" ");
            }
        }

        // Time Complexity : O(n^2)
        // Space Complexity : O(1)
    }
}
