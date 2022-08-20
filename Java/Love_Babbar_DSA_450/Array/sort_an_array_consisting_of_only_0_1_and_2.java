/*
...Sort an array consisting of only 0 , 1 and 2...
 */


package Love_Babbar_DSA_450.Array;
import java.util.*;

public class sort_an_array_consisting_of_only_0_1_and_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //declaring and initialising an array...
        int[] arr = new int[n];
        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }

        //putting elements to the priority queue...
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0 ;i<n ; i++){
            pq.add(arr[i]);
        }

        // printing the array...
        while(!pq.isEmpty()){
            System.out.print(pq.poll()+" ");
        }
        // Time Complexity : O(N*logN)
        // Space Complexity : O(N)


    }
}
