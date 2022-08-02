
/*
In this question we have to find the non repeating elements of the array..
 */


package TCS_NQT_Striver_Sheet.Problems_on_Arrays;
import java.util.*;

public class find_all_non_repeating_elements_of_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // declaring and initialising the array...
        int[] arr = new int[n];
        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }

        HashMap<Integer , Integer> hash = new HashMap<>();
        for(int i=0 ; i<n ; i++){
            hash.put(arr[i] , hash.getOrDefault(arr[i] , 0)+1);
        }

        System.out.println("The non-repeating elements are : ");
        for(int i:hash.keySet()){
            if(hash.get(i)==1){
                System.out.print(i+" ");
            }
        }

    }
}
