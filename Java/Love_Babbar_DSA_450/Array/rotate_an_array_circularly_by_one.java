/*

...Rotate an array circularly by one...

 */


package Love_Babbar_DSA_450.Array;
import java.util.*;

public class rotate_an_array_circularly_by_one {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // declare the array..
        int[] arr = new int[n];
        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }

        // rotating the array...
        int key = arr[0];
        for(int i=1 ; i<n ; i++){
            arr[i-1] = arr[i];
        }
        arr[n-1] = key;

        // the rotated array is :

        for(int i=0 ; i<n ; i++){
            System.out.print(arr[i]+" ");
        }

        // Time Complexity : O(N)
        // Space Complexity : O(1)
    }
}
