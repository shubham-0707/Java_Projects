

/*

In this question we have to insert an element at beginning of the array..

 */


package TCS_NQT_Striver_Sheet.Problems_on_Arrays;
import java.util.*;

public class Insert_an_element_at_beginning {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // declaring and initialising the array...
        int[] arr = new int[n];
        for(int i=0 ; i<n-1 ; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the element to be inserted : ");
        int k = sc.nextInt();

        for(int i=arr.length-1 ; i>=1 ; i--){
            arr[i] = arr[i-1];
        }

        arr[0] = k;
        for(int i=0 ; i<n ; i++){
            System.out.print(arr[i]+" ");
        }
        // Time Complexity : O(n)
        // Space Complexity : O(1) if we ignore the input
    }
}
