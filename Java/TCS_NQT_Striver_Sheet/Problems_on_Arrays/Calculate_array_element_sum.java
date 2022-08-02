
/*

In this  question we have to calculate the sum of the array elements...

 */


package TCS_NQT_Striver_Sheet.Problems_on_Arrays;
import java.util.*;

public class Calculate_array_element_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }

        int sum = 0;
        for(int i=0 ; i<arr.length ; i++){
            sum+=arr[i];
        }

        System.out.println("The sum of the array is : "+sum);

        // Time Complexity : O(n)
        // Space Complexity : O(1) if we ignore the array input.
    }
}
