

/*

Example 1:
Input: nums = [2,3,-1,8,4]
Output: 3
Explanation: The sum of the numbers before index 3 is: 2 + 3 + -1 = 4
The sum of the numbers after index 3 is: 4 = 4

Example 2:
Input: nums = [1,-1,4]
Output: 2
Explanation: The sum of the numbers before index 2 is: 1 + -1 = 0
The sum of the numbers after index 2 is: 0

 */


package TCS_NQT_Striver_Sheet.Problems_on_Arrays;
import java.util.*;

public class finding_equilibrium_index_in_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum = 0;
        int[] arr = new int[n];
        // initialising the array..
        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }

        for(int i=0 ; i<n ; i++){
            sum+=arr[i];
        }

        int prevSum = 0;
        int index = -1;
        for(int i=0 ; i<n ; i++){
            if(prevSum == sum-prevSum-arr[i]){
                index = i;
                break;
            }
            prevSum+=arr[i];
        }

        if(index==-1){
            System.out.println("There is no equilibrium index in the array..");
            return;
        }
        System.out.println("The equilibrium index is : "+index);

        // Time Complexity : O(n)
        // Space Complexity : O(1)

    }
}
