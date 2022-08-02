

/*

In this question we have to find the frequencies of every element in the array..

 */


package TCS_NQT_Striver_Sheet.Problems_on_Arrays;
import java.util.*;

public class count_frequencies_of_every_element_in_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // declaring and initialising array...

        int[] arr = new int[n];
        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }

        /*

        1st approach : In this approach we will make a frequency array of the size which is 1 greater
        than the maximum element in the array.

        Then we can easily perform the count operation in that array...

         */

        LinkedHashMap<Integer , Integer> hash = new LinkedHashMap<>();

        for(int i=0 ; i<n ; i++){
            hash.put(arr[i] , hash.getOrDefault(arr[i] , 0)+1);
        }

        for(int i: hash.keySet()){
            System.out.println(i+" occured "+hash.get(i)+" times in the array");
        }

        // Time Complexity : O(n)
        // Space Complexity : O(n)
    }
}
