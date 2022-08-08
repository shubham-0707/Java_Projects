/*

In this question we have to print any subsequence equals to a given value...

 */


package Practice.Recursion;
import java.util.*;

public class print_any_subsequence_with_given_sum {

    public static boolean sub_Sum(int idx , int[] arr , ArrayList<Integer> ds , int s , int sum){
        if(idx==arr.length){
            if(s==sum){
                for(int i=0 ; i<ds.size() ; i++){
                    System.out.print(ds.get(i)+" ");
                }
                return true;
            }
            else{
                return false;
            }
        }

        // picking an element and checking for that...
        s+=arr[idx];
        ds.add(arr[idx]);
        if(sub_Sum(idx+1 , arr , ds , s , sum)){
            return true;
        }

        // removing an element and checking for that...
        s-=arr[idx];
        ds.remove(ds.size()-1);
        if(sub_Sum(idx+1 , arr , ds , s , sum)){
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println("Enter the array elements : ");
        int[] arr = new int[n];
        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the sum required : ");
        int sum = sc.nextInt();
        ArrayList<Integer> ds = new ArrayList<>();
        sub_Sum(0 , arr , ds , 0 , sum);

        // Time Complexity : O(2^N) because at every recursive call we have 2 more recursive calls..
        // Space Complexity : O(N)
    }
}
