/*

You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.

Merge nums1 and nums2 into a single array sorted in non-decreasing order.

The final sorted array should not be returned by the function, but instead be stored inside the array nums1. To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n.



Example 1:

Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
Output: [1,2,2,3,5,6]
Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.
Example 2:

Input: nums1 = [1], m = 1, nums2 = [], n = 0
Output: [1]
Explanation: The arrays we are merging are [1] and [].
The result of the merge is [1].
Example 3:

Input: nums1 = [0], m = 0, nums2 = [1], n = 1
Output: [1]
Explanation: The arrays we are merging are [] and [1].
The result of the merge is [1].
Note that because m = 0, there are no elements in nums1. The 0 is only there to ensure the merge result can fit in nums1.


Constraints:

nums1.length == m + n
nums2.length == n
0 <= m, n <= 200
1 <= m + n <= 200
-109 <= nums1[i], nums2[j] <= 109

 */


package Striver_Sheet_Solutions_DayWise.Day_2;
import java.util.*;

public class Merge_Sorted_Array_without_using_extra_space {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();
        System.out.println("Enter m : ");
        int m = sc.nextInt();


        //declare and initialise array...
        int[] arr1 = new int[n+m];
        int[] arr2 = new int[m];


        for(int i=0 ; i<n ; i++){
            arr1[i] = sc.nextInt();
        }

        for(int i=0 ; i<m ; i++){
            arr2[i] = sc.nextInt();
        }

        // Approach 1 : Brute Force : Time Complexity : (n*logn)
        // Intution : Appending all the values of arr2 in arr1 and then sorting them..

       /*

        for(int i=0 ; i<m ; i++){
            arr1[n+i] = arr2[i];
        }

        Arrays.sort(arr2);

        */

        // Approach 2 : using Merge sort algorithm...

        // sorting the array..

        int i=n-1;
        int j=m-1;
        int k = n+m-1;

        while(i>=0 && j>=0){
            if(arr1[i]>=arr2[j]){
                arr1[k--] = arr1[i--];
            }
            else{
                arr1[k--] = arr2[j--];
            }
        }

        // if still there are elements in arr1..
        while(i>=0){
            arr1[k--] = arr1[i--];
        }

        // if still there are elements in arr2..

        while(j>=0){
            arr1[k--] = arr2[j--];
        }

        // printing the resultant array..

        for(int x=0 ; x<n+m ; x++){
            System.out.print(arr1[x]+" ");
        }

        // Time Complexity : O(n+m)


    }
}
