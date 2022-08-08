/*

In this question we have to count the subsequences that sum to a given value...

*/


package Practice.Recursion;
import java.util.*;

public class count_subsequences_with_a_given_sum {

    public static int subSum_count(int idx , int[] arr , int s , int sum){
        if(idx==arr.length){
            if(s==sum)
                return 1;
            else
                return 0;
        }

        // picking the element...
        s+=arr[idx];
        int l = subSum_count(idx+1 , arr , s , sum);

        // not picking the element...
        s-=arr[idx];
        int r = subSum_count(idx+1 , arr , s , sum);

        return l+r;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the array elements : ");
        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the sum needed : ");
        int sum = sc.nextInt();

        System.out.println("The number of subsequences are : ");
        System.out.println(subSum_count(0 , arr , 0 , sum));

        // Time Complexity : O(n)
        // Space Complexity : O(1)
    }
}
