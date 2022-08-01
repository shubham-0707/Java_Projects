package Practice.Arrays;
import java.util.*;

public class sort_an_array_of_0_1_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
            pq.add(arr[i]);
        }

        for(int i=0 ; i<n ; i++){
            arr[i] = pq.poll();
        }

        System.out.println("The sorted array is : ");
        for(int i=0 ; i<n ; i++){
            System.out.print(arr[i] + " ");
        }
        return;
    }
}
