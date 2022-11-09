package Big_Oh_Assignment;
import java.util.*;

public class trapping_rain_water {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }

        /*
        The main approach to this question is that we will find the left max and right max and then we will find the
        minimum of that ...
        After that we will find the difference of it with the current arr[i]...
         */

        int[] left_max = new int[arr.length];
        int[] right_max = new int[arr.length];

        left_max[0] = arr[0];
        right_max[arr.length-1] = arr[arr.length-1];

        for(int i=1 ; i<arr.length ; i++){
            left_max[i] = Math.max(left_max[i-1] , arr[i]);
        }
        for(int i=arr.length-2 ; i>=0 ; i--){
            right_max[i] = Math.max(right_max[i+1] , arr[i]);
        }

        int ans = 0;

        for(int i=1 ; i<arr.length ; i++){
            ans += Math.min(left_max[i] , right_max[i]) - arr[i];
        }

        System.out.println("The total water trapped in the container is : "+ans);
    }
}
