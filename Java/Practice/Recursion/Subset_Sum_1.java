/*

In this question I have to print the sum of every subset of the array...

 */

package Practice.Recursion;
import java.util.*;

public class Subset_Sum_1 {

    public static void subset_Sum(int idx , HashMap<Integer , Integer> hash , int[] arr , int sum){
        if(idx==arr.length){
            if(!hash.containsKey(sum)){
                hash.put(sum ,0);
            }
            return;
        }

        // picking...
        sum+=arr[idx];
        subset_Sum(idx+1 , hash , arr , sum);

        // not picking;
        sum-=arr[idx];
        subset_Sum(idx+1 , hash , arr , sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        HashMap<Integer , Integer> hash = new HashMap<>();
        subset_Sum(0 , hash , arr , 0);

        for(int i:hash.keySet()){
            System.out.print(i+" ");
        }
    }
}
