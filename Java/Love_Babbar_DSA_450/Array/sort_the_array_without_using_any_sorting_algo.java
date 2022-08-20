
/*

...Sorting the array without using any sorting algo....

 */

package Love_Babbar_DSA_450.Array;
import java.util.*;

public class sort_the_array_without_using_any_sorting_algo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        // declaring and initialising the array..
        int[] arr = new int[n];
        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int i=0 ; i<n ; i++){
            pq.add(arr[i]);
        }

        for(int i=0 ; i<n ; i++){
            arr[i] = pq.poll();
        }

        // sorted array is :

        for(int i=0 ; i<n ; i++){
            System.out.print(arr[i]+" ");
        }

        // Time Complexity : O(N)
        // Space Complexity : O(N)
    }
}
