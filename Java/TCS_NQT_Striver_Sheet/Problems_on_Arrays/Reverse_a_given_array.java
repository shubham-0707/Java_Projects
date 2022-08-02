

/*

In this question we have to reverse the array...

 */

package TCS_NQT_Striver_Sheet.Problems_on_Arrays;
import java.util.*;

public class Reverse_a_given_array {
    public static  void reverse(int[] arr){
        int start = 0;
        int end = arr.length-1;

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

        /*
        Approach 1 : We have a simple approach of taking the input into an arrayList and then using
        Collections.reverse(arr)

         Time Complexity : O(n)
         Space Complexity : O(n)
         */

        // reversing process start from here...
        reverse(arr);

        // printing the array..

        for(int i=0 ; i<n ; i++){
            System.out.print(arr[i]+" ");
        }

        // Time Complexity : O(n)
        // Space Complexity : O(1)
    }
}
