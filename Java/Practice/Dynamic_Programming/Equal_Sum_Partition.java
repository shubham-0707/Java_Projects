package Practice.Dynamic_Programming;
import java.util.*;

public class Equal_Sum_Partition {

    public static boolean solve(int sum1 , int sum2 , int idx , int[] arr){
        if(idx==arr.length){
            if(sum1==sum2) return true;
            else return false;
        }

        //pick in sum1...
        sum1+=arr[idx];
        boolean pick = solve(sum1 , sum2 , idx+1 , arr);
        sum1-=arr[idx];
        boolean notPick = solve(sum1 , sum2+arr[idx] , idx+1 , arr);

        return pick || notPick;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("The answer is: "+solve(0 , 0 , 0 , arr));
    }
}
