
/*

In this question we have to remove all the duplicates from the sorted array...

 */


package TCS_NQT_Striver_Sheet.Problems_on_Arrays;
import java.util.*;

public class remove_duplicates_from_array {

    public static int removeDuplicates(int[] arr){
        int i=0;
        for(int j=1 ; j<arr.length ; j++){
            if(arr[j]!=arr[i]){
                i++;
                arr[i] = arr[j];
            }
        }
        return i+1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        //declaring and initialising the array..

        int[] arr = new int[n];
        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }

        /*
        Approach 1 : Approach 1 could be using of a hashmap and then putting the map keys into the array
         */

        n = removeDuplicates(arr);

        System.out.println("The sorted and remove duplicates array...");
        for(int i=0 ; i<n ; i++){
            System.out.print(arr[i]+" ");
        }

        // Time Complexity : O(n)
        // Space Complexity : O(1) if we ignore the input..

    }
}
