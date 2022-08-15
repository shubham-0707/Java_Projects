/*

...Bubble Sort Algorithm...

 */

package TCS_NQT_Striver_Sheet.Problems_on_Sorting;
import java.util.*;

public class Bubble_Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter your array elements : ");
        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }

        // sorting process starts from here...
        for(int i=0 ; i<n ; i++){
            for(int j=i+1 ; j<n ; j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        // the sorted array is :
        System.out.println("The sorted array is : ");
        for(int i=0 ; i<n ; i++){
            System.out.print(arr[i]+" ");
        }

        // Time Complexity : O(N^2)
        // Space Complexity : O(1) if input is ignored...
    }
}
