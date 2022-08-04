/*
In this program we have to reverse a number ..
 */


package TCS_NQT_Striver_Sheet.Problems_on_Numbers;
import java.util.*;

public class reverse_a_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();

        int reverse = 0;

        while(n>0){
            int res = n%10;
            reverse = reverse*10+res;
            n/=10;
        }

        System.out.println("The reverse number is : "+reverse);

        // Time Complexity : O(N) n is the number of digits in the number ..
        // Space Complexity : O(1)

    }
}
