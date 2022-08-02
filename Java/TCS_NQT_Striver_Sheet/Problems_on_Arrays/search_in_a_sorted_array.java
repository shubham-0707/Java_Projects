
/*

In this question we have to find the index of an element if the array is sorted

 */

package TCS_NQT_Striver_Sheet.Problems_on_Arrays;
import java.util.*;

public class search_in_a_sorted_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // declaring and initialising the array..

        int[] arr = new int[n];
        System.out.println("Enter the elements in sorted order : ");
        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter key : ");
        int key = sc.nextInt();

        int index = -1;

        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;

            if(arr[mid]==key){
                index = mid;
                break;
            }
            else if(arr[mid]<key){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }

        if(index == -1){
            System.out.println("The key is not found in the array ");
            return;
        }

        System.out.println("The key is found at "+index);

        // Time Complexity : O(logn)
        // Space Complexity : O(1) if we ignore input..

    }
}
