/*

...Largest sum contiguous subarray...

 */


package Love_Babbar_DSA_450.Array;
import java.util.*;


public class largest_sum_contiguous_subarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //declare and initialise the array...
        int[] arr = new int[n];
        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }

        int maxi = Integer.MIN_VALUE;
        int sum = 0;
        for(int i=0 ; i<n ; i++){
            sum+=arr[i];
            maxi = Math.max(maxi , sum);
            if(sum<0){
                sum=0;
            }
        }

        System.out.println("The largest sum of the subarray is : "+maxi);

        // Time Complexity : O(N)
        // Space Complexity : O(1)
    }
}
