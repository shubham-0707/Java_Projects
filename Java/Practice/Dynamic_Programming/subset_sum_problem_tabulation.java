package Practice.Dynamic_Programming;

import java.util.*;

public class subset_sum_problem_tabulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i=0 ; i<arr.length ; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the sum required: ");
        int sum = sc.nextInt();

        boolean[][] dp = new boolean[n+1][sum+1];

        for(int i=0 ; i<dp.length ; i++){
            dp[i][0] = true;
        }

        for(int i=1 ; i<dp.length ; i++){
            for(int j=1 ; j<dp[0].length ; j++){
                if(arr[i-1]<=j){
                    dp[i][j] = dp[i-1][j-arr[i-1]] || dp[i-1][j];
                }
                else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        System.out.println("The answer is : "+dp[n][sum]);
    }
}
