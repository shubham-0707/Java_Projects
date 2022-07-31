
/* Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.

A subarray is a contiguous part of an array.



Example 1:

Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: [4,-1,2,1] has the largest sum = 6.
Example 2:

Input: nums = [1]
Output: 1
Example 3:

Input: nums = [5,4,-1,7,8]
Output: 23 */

package Striver_Sheet_Solutions_DayWise.Day_1;
import java.util.*;

public class Kadanes_Algorithm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //declaring and initialising array..
        int[] arr = new int[n];
        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }

        //initialising maximum and sum..
        int sum = 0;
        int maxi = Integer.MIN_VALUE;

        for(int i=0 ; i<n ; i++){
            sum+=arr[i];
            if(sum>maxi){
                maxi = sum;
            }
            if(sum<0){
                sum = 0;
            }
        }

        System.out.println("the maximum subarray sum is : "+maxi);

        // Time Complexity : O(n)
        // Space Complexity : O(1) if we ignore input..
    }
}
