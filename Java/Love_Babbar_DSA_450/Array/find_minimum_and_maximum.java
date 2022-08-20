
/*

... Find minimum and maximum element of the array...

 */

package Love_Babbar_DSA_450.Array;
import java.util.*;

public class find_minimum_and_maximum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //declaring and initialising array...

        int[] arr = new int[n];
        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }

        int mini = Integer.MAX_VALUE;
        int maxi = Integer.MIN_VALUE;

        for(int i=0 ; i<n ; i++){
            mini = Math.min(mini , arr[i]);
            maxi = Math.max(maxi , arr[i]);
        }

        System.out.println("Maximum element is : "+maxi);
        System.out.println("Minimum element is : "+mini);

        // Time Complexity : O(N)
        // Space Complexity : O(1)
    }
}
