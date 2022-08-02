


/*

In this question we have to find the median of the array..


 */

package TCS_NQT_Striver_Sheet.Problems_on_Arrays;
import java.util.*;

public class find_median_of_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // declaring the initialising the array..

        int[] arr = new int[n];
        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        double median = 0;

        if(n%2==0){
            median = (arr[n/2- 1]+arr[n/2])/(2*1.0);
        }

        else{
            median = arr[n/2];
        }

        System.out.println("The median is : "+median);

        // Time Complexity : O(n*logn)
        // Space Complexity : O(1) if input is ignored...
    }
}
