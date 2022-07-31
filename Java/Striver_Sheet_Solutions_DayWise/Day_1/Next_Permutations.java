/* A permutation of an array of integers is an arrangement of its members into a sequence or linear order.

        For example, for arr = [1,2,3], the following are considered permutations of arr: [1,2,3], [1,3,2], [3,1,2], [2,3,1].
        The next permutation of an array of integers is the next lexicographically greater permutation of its integer. More formally, if all the permutations of the array are sorted in one container according to their lexicographical order, then the next permutation of that array is the permutation that follows it in the sorted container. If such arrangement is not possible, the array must be rearranged as the lowest possible order (i.e., sorted in ascending order).

        For example, the next permutation of arr = [1,2,3] is [1,3,2].
        Similarly, the next permutation of arr = [2,3,1] is [3,1,2].
        While the next permutation of arr = [3,2,1] is [1,2,3] because [3,2,1] does not have a lexicographical larger rearrangement.
        Given an array of integers numbs, find the next permutation of numbs.

        The replacement must be in place and use only constant extra memory.



        Example 1:

        Input: numbs = [1,2,3]
        Output: [1,3,2]
        Example 2:

        Input: numbs = [3,2,1]
        Output: [1,2,3]
        Example 3:

        Input: numbs = [1,1,5]
        Output: [1,5,1]

*/

package Striver_Sheet_Solutions_DayWise.Day_1;
import java.util.*;

public class Next_Permutations {

    public static void swap(int[] arr , int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void reverse(int[] arr  , int start , int end){
        while(start<end){
            swap(arr , start , end);
            start++;
            end--;
        }
    }
    public static void nextPermutation(int[] arr){
        int i = arr.length-2;
        while(i>=0 && arr[i]>=arr[i+1]){
            i--;
        }
        if(i>=0){
            int j = arr.length-1;
            while(arr[j]<=arr[i]){
                j--;
            }
            swap(arr , i ,j);
        }
        reverse(arr , i+1 , arr.length-1);

        //printing the resultant array..
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // making an array..
        int[] arr  = new int[n];

        //inserting values to array.
        for(int i=0  ;i<n ; i++){
            arr[i] = sc.nextInt();
        }

        nextPermutation(arr);

        // Time Complexity : O(n)
        // Space Complexity : O(1)
    }
}
