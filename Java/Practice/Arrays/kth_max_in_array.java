package Practice.Arrays;
import java.util.*;


// This program is made to find the kth maximum element from the array...
public class kth_max_in_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];


        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
            pq.add(arr[i]);
        }

        System.out.println("Enter K : ");
        int K = sc.nextInt();
        int target = arr.length-K;

        int ans = -1;
        for(int i=0 ; i<arr.length ; i++){
            if(i==target){
                ans = pq.peek();
                break;
            }
            pq.poll();
        }

        System.out.println("The answer is : "+ans);
        return;
    }
}
