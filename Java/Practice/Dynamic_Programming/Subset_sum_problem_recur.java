package Practice.Dynamic_Programming;
import java.util.*;

//In this problem we have to find out that there is any subset whose sum is equal to the given sum or not...

public class Subset_sum_problem_recur {

    public static boolean solve(int idx , int[] arr , int target){
        if(idx==arr.length){
            if(target==0) return true;
            else return false;
        }
        if(target==0) return true;

        //picking...
        boolean pick = solve(idx+1 , arr , target-arr[idx]);

        //not picking...
        boolean notPick = solve(idx+1 , arr , target);

        return pick || notPick;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter a value to check: ");

        int sum = sc.nextInt();

        System.out.println("the answer is : "+solve(0 , arr , sum));

        return;
    }
}
