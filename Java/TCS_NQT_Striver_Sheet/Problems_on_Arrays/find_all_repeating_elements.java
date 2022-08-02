
/*
In this question we have to find all the repeating elements in the array...
 */

package TCS_NQT_Striver_Sheet.Problems_on_Arrays;
import java.util.*;

public class find_all_repeating_elements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //declaring and initialising the array...

        int[] arr = new int[n];
        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }

        LinkedHashMap<Integer , Integer> hash = new LinkedHashMap<>();
        for(int i=0 ; i<n ; i++){
            hash.put(arr[i] , hash.getOrDefault(arr[i] , 0)+1);
        }

        for(int i:hash.keySet()){
            if(hash.get(i)>1){
                System.out.print(i+" ");
            }
        }

        // Time Complexity : O(n)
        // Space Complexity : O(n)
    }
}
