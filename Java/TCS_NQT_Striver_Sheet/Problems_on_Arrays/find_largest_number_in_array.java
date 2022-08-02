
/*

This problem is asking for the largest element of the array...

 */


package TCS_NQT_Striver_Sheet.Problems_on_Arrays;
import java.util.*;

public class find_largest_number_in_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }

        int maxi = Integer.MIN_VALUE;

        for(int i=0 ; i<n ; i++){
            maxi = Math.max(maxi , arr[i]);
        }

        System.out.println("The largest number in the array is : "+maxi);

        // Time Complexity : O(n)
        // Space Complexity : O(1)

    }
}
