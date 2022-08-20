/*

...Checking the array equality in java...

 */


package Practice.Arrays;
import java.util.*;


public class array_equality_in_java {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];


        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }

        int[] temp = arr;
        for(int i=0 ; i<n ; i++){
            System.out.print(temp[i]+" ");
        }

        // Time Complexity : O(1)
        // Space Complexity : O(N)

    }
}
