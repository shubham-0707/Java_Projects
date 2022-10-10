package Big_Oh_Assignment;
import java.util.*;

public class frog_with_k_jumps {
    // Recursive Solution.....
    public static int minimumSteps(int index , int[] arr , int k){
        if(index==0) return 0;
        int mini = Integer.MAX_VALUE;

        for(int i=1 ; i<=k ; i++){
            if(index-i>=0){
                int minSteps = Math.abs(arr[index] - arr[index-i]) + minimumSteps(index-i , arr , k);
                mini = Math.min(mini , minSteps);
            }
            else break;
        }

        return mini;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] arr = new int[n];
        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("The minimum steps is : " + minimumSteps(arr.length-1 , arr , k));


    }
}
