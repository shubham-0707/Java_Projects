

/*

In this question we have to insert an element to the last of an array..

 */

package TCS_NQT_Striver_Sheet.Problems_on_Arrays;
import java.util.*;

public class insert_an_element_at_last_of_an_array {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        // declaring and initialising the array..

        int[] arr = new int[n];
        for(int i=1 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the element to be added : ");
        int k = sc.nextInt();

        for(int i=0 ; i<n-1 ; i++){
            arr[i] = arr[i+1];
        }
        arr[n-1] = k;

        System.out.println("The resultant array is : ");
        for(int i=0 ; i<n ; i++){
            System.out.print(arr[i]+" ");
        }

        // Time Complexity : O(n)
        // Space Complexity : O(1)

    }

}
