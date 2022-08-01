package Practice.Arrays;
import java.util.*;


// This program is made to find the maximum and minimum element from an array...
public class Min_max_in_an_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }

        int mini = Integer.MAX_VALUE;
        int maxi = Integer.MIN_VALUE;

        for(int i=0 ; i<n ; i++){
            maxi = Math.max(maxi , arr[i]);
            mini = Math.min(mini , arr[i]);
        }

        System.out.println("The minimum element is : "+mini);
        System.out.println("The maximum element is : "+maxi);
    }
}
