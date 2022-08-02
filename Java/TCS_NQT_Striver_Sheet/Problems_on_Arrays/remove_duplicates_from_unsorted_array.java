
/*

In this question we have to remove the duplicates form an unsorted array..

 */


package TCS_NQT_Striver_Sheet.Problems_on_Arrays;
import java.util.*;

public class remove_duplicates_from_unsorted_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }

        /*
        Approach 1 : in first approach we will use an additional array and mark all the elements of the
        indexes of the array as false.

        Then we will mark the index as true when we encounter any element of the array in the additional
        array..
         */

        LinkedHashMap<Integer , Integer> hash = new LinkedHashMap<>();
        for(int i=0 ; i<n ; i++){
            hash.put(arr[i] , hash.getOrDefault(arr[i] , 0)+1);
        }

        System.out.println("The unique elements are...");
        for(int i : hash.keySet()){
            System.out.print(i+" ");
        }

    }
}
