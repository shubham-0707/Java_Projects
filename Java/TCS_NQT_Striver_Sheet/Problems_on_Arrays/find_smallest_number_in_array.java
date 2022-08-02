

// This question is asking for the smallest number in the array...
package TCS_NQT_Striver_Sheet.Problems_on_Arrays;
import java.util.*;

public class find_smallest_number_in_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }

        int mini = Integer.MAX_VALUE;
        for(int i=0 ; i<n ; i++){
            mini = Math.min(mini , arr[i]);
        }

        System.out.println("The minimum number is : "+mini);

        // Time Complexity : O(n)
        // Space Complexity : O(1) if we ignore the input array
    }
}
