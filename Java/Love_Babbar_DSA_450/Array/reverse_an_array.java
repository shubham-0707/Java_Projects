/*
...Reverse an array...
 */

package Love_Babbar_DSA_450.Array;
import java.util.*;

public class reverse_an_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }

        /*
        Brute Force approach can be :

        Approach 1 : In this approach I will store the whole array from backward direction in a new array

        // Time Complexity : O(N)
        // Space Complexity : O(N)

         */

        int start = 0;
        int end = arr.length-1;

        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

        // reversed array is :
        for(int i=0 ; i<n ; i++){
            System.out.print(arr[i]+" ");
        }

        // Time Complexity : O(n)
        // Space Complexity : O(1)

    }
}
