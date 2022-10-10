package Big_Oh_Assignment;
import java.util.*;

public class frog_with_k_jumps_tabulation {

    public static int tabulate_function(int n , int[] dp , int[] arr , int k){


        for(int i=1 ; i<=n ; i++){

            int minSteps = Integer.MAX_VALUE;
            for(int j=1 ; j<=k ; j++){
                if(i-j>=0){
                    int jump = dp[i-j] + Math.abs(arr[i-j]-arr[i]);
                    minSteps = Math.min(minSteps , jump);
                }
            }
            dp[i] = minSteps;
        }

        return dp[n];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] arr = new int[n];
        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        int[] dp = new int[n];
        dp[0] = 0;

        System.out.println("The minimum steps is : "+tabulate_function(arr.length-1 , dp , arr , k));

    }
}
