package Java_Problems.Java.com.example.Arrays;
import java.util.*;



// This program is made to find the kth minimum from the array...
public class find_kth_minimum_from_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter k : ");
        int k = sc.nextInt();
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int i=0 ; i<arr.length ; i++){
            pq.add(arr[i]);
        }
        int ans = -1;
        for(int i=0 ; i<n ; i++){
            if(i==k-1){
                ans = pq.peek();
                break;
            }
            pq.poll();
        }
        System.out.println("Answer is : "+ans);
        return;

    }
}
