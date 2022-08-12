/*
... Permutations of an array...
 */


package Practice.Recursion;
import java.util.*;

public class permutations_of_an_array {

    public static void recurPermute(int idx , int[] arr , ArrayList<ArrayList<Integer>> ans){
        if(idx==arr.length){
            ArrayList<Integer> temp = new ArrayList<>();
            for(int i=0 ; i<arr.length ; i++){
                temp.add(arr[i]);
            }
            ans.add(new ArrayList<>(temp));
            return;
        }

        for(int i=idx ; i<arr.length ; i++){
            swap(i , idx , arr);
            recurPermute(idx+1 , arr , ans);
            swap(i , idx , arr);
        }
    }

    public static void swap(int i , int j , int[] arr){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();

        // declaring and initialising the array....
        int[] arr = new int[n];
        System.out.println("Enter array elements : ");
        for(int i=0 ; i<n; i++){
            arr[i] = sc.nextInt();
        }

        // initialising and declaring the answer ArrayList...
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        //calling the recursive function
        recurPermute(0 , arr , ans);

        System.out.println("The permutations are : ");
        for(int i=0 ; i<ans.size() ; i++){
            for(int j=0 ; j<ans.get(i).size() ; j++){
                System.out.print(ans.get(i).get(j)+" ");
            }
            System.out.println();
        }

        // Time Complexity : O(n*n!) (Very high time complexity !!)
        // Space Complexity : O(1) (NO extra space used)
    }
}
