/*
Example 1:
Input: N = 7, array[] = {1,2,3,4,5,6,7} , k=2 , right
Output: 6 7 1 2 3 4 5
Explanation: array is rotated to right by 2 position .

In this question we have to rotate the k array elements by right..

 */


package TCS_NQT_Striver_Sheet.Problems_on_Arrays;
import java.util.*;

public class rotate_k_elements_by_right_in_array {

    public static void reverseArray(int[] arr , int start , int end){
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter k : ");
        int k = sc.nextInt();

        reverseArray(arr , 0 , k-1);
        reverseArray(arr , n-k-1 , n-1);
        reverseArray(arr , 0 , n-1);

        System.out.println("The rotated array : ");
        for(int i=0 ; i<n ; i++ ){
            System.out.print(arr[i]+" ");
        }
    }
}
