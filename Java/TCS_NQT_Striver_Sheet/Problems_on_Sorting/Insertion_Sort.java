/*

...Insertion Sort...

 */

package TCS_NQT_Striver_Sheet.Problems_on_Sorting;
import java.util.*;

public class Insertion_Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size : ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter array elements : ");
        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }

        // sorting process started from here...
        for(int i=1 ; i<n ; i++){
            int j = i-1;
            int key = arr[i];
            while(j>=0 && key<arr[j]){
                arr[j+1] = arr[j];
                j=j-1;
            }
            arr[j+1] = key;
        }


        System.out.println("The sorted array is : ");
        for(int i=0 ; i<n ; i++){
            System.out.print(arr[i]+" ");
        }

        // Time Complexity : O(N^2)
        // Space Complexity : O(1)
    }
}
