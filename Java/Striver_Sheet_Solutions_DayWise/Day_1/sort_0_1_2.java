/*

Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.

We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.

You must solve this problem without using the library's sort function.



Example 1:

Input: nums = [2,0,2,1,1,0]
Output: [0,0,1,1,2,2]
Example 2:

Input: nums = [2,0,1]
Output: [0,1,2]


Constraints:

n == nums.length
1 <= n <= 300
nums[i] is either 0, 1, or 2.

 */


package Striver_Sheet_Solutions_DayWise.Day_1;
import java.util.*;

public class sort_0_1_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }

        // Approach 1 : Using priority Queue ( T.C. : O(n*logn) )

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i:arr){
            pq.add(i);
        }

        for(int i=0 ; i<n ; i++){
            System.out.print(pq.poll()+" ");
        }
        System.out.println();

        // Approach 2 : Using a count array or hashmap.  (T.C. is : O(n))
        HashMap<Integer , Integer> hash = new HashMap<>();

        for(int i:arr){
            hash.put(i , hash.getOrDefault(i , 0)+1);
        }

        int k = 0;
        for(int i=0 ; i<hash.get(0) ; i++){
            arr[k++] = 0;
        }
        for(int i=0 ; i<hash.get(1) ; i++){
            arr[k++] = 1;
        }
        for(int i=0 ; i<hash.get(2) ; i++){
            arr[k++] = 2;
        }

        // printing the array..

        for(int i=0 ; i<n ; i++){
            System.out.print(arr[i]+" ");
        }

    }
}
