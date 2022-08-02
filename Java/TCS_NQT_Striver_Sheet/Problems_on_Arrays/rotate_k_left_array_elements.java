
/*

Example 1:
Input: N = 6, array[] = {3,7,8,9,10,11} , k=3 , left
Output: 9 10 11 3 7 8
Explanation: Array is rotated to right by 3 position.


In this question we are going to left rotate the array by k elements...

 */



package TCS_NQT_Striver_Sheet.Problems_on_Arrays;
import java.util.*;

public class rotate_k_left_array_elements {

    public static void reverseArray(int[] arr , int start , int end){
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    /*

    Approach 1 : In the first approach we can save the array elements that have to rotated in a new temp and
    then shift the whole array and then place the temp array elements to that place...

     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // declaring and initialising the array..
        int[] arr = new int[n];
        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter k : ");
        int k = sc.nextInt();

        reverseArray(arr , n-k , n-1);
        reverseArray(arr , 0 , n-k-1);
        reverseArray(arr , 0 , n-1);


        System.out.println("Printing reverse array : ");
        for(int i=0 ; i<n ; i++){
            System.out.print(arr[i]+" ");
        }

        // Time Complexity : O(n)
        // Space Complexity : O(1) if we ignore input..

    }
}
