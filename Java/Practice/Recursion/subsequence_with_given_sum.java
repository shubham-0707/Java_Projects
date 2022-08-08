/*
In this question we have to find the subsequences with a given sum...
 */

package Practice.Recursion;
import java.util.*;

public class subsequence_with_given_sum {

    public static void subSum(int idx , int[] arr , ArrayList<Integer> ds , int s , int sum){
        if(idx==arr.length){
            if(s==sum){
                for(int i=0 ; i<ds.size() ; i++){
                    System.out.print(ds.get(i)+" ");
                }
                System.out.println();
            }
            return;
        }
        // picking the element...
        s+=arr[idx];
        ds.add(arr[idx]);
        subSum(idx+1 , arr , ds , s , sum);

        // not picking the element...
        s-=arr[idx];
        ds.remove(ds.size()-1);
        subSum(idx+1 , arr , ds , s , sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the sum required : ");
        int sum = sc.nextInt();
        ArrayList<Integer> ds = new ArrayList<>();
        subSum(0 , arr , ds , 0 , sum);

        /*
        Approach : In this we are using the recursion approach and

        Time Complexity : O(2^n)
        Space Complexity : O(n) due to use of a data structure to store the elements...

         */
    }
}
