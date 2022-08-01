
/*

Given an array of integers. Find the Inversion Count in the array.

Inversion Count: For an array, inversion count indicates how far (or close) the array is from being sorted. If array is already sorted then the inversion count is 0. If an array is sorted in the reverse order then the inversion count is the maximum.
Formally, two elements a[i] and a[j] form an inversion if a[i] > a[j] and i < j.


Example 1:

Input: N = 5, arr[] = {2, 4, 1, 3, 5}
Output: 3
Explanation: The sequence 2, 4, 1, 3, 5
has three inversions (2, 1), (4, 1), (4, 3).
Example 2:

Input: N = 5
arr[] = {2, 3, 4, 5, 6}
Output: 0
Explanation: As the sequence is already
sorted so there is no inversion count.
Example 3:

Input: N = 3, arr[] = {10, 10, 10}
Output: 0
Explanation: As all the elements of array
are same, so there is no inversion count.
Your Task:
You don't need to read input or print anything. Your task is to complete the function inversionCount() which takes the array arr[] and the size of the array as inputs and returns the inversion count of the given array.

Expected Time Complexity: O(NLogN).
Expected Auxiliary Space: O(N).

Constraints:
1 ≤ N ≤ 5*105
1 ≤ arr[i] ≤ 1018

 */

package Striver_Sheet_Solutions_DayWise.Day_2;
import java.util.*;

public class count_inversions {

    public static long merge(long[] arr , int start , int mid , int end){
        long inv_count = 0;

        int i  = start;
        int j = mid;
        int k = 0;

        long[] temp = new long[end-start+1];

        while(i<mid && j<=end){
            if(arr[i]<=arr[j]){
                temp[k++] = arr[i++];
            }
            else{
                temp[k++] = arr[j++];
                inv_count+=(mid-1);
            }
        }

        while(i<mid){
            temp[k++] = arr[i++];
        }

        while(j<=end){
            temp[k++] = arr[j++];
        }

        for(i = start , k=0 ; i<=end ; i++ , k++){
            arr[i] =temp[k];
        }

        return inv_count;
    }

    public static long mergeSort(long[] arr , int start , int end){
        long inv_count = 0;

        if(end>start){
            int mid = start + (end-start)/2;
            inv_count+=mergeSort(arr , start , mid);
            inv_count+=mergeSort(arr , mid+1 , end);
            inv_count+=merge(arr , start , mid+1 , end);

        }

        return inv_count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // declaring and initialising array...
        long[] arr = new long[n];
        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextLong();
        }

        System.out.println(mergeSort(arr , 0 , arr.length-1));
    }
}
