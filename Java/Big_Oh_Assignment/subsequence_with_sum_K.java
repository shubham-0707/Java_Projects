package Big_Oh_Assignment;
import java.util.*;

public class subsequence_with_sum_K {

    public static void subsequence(int[] arr ,int index ,  int new_sum , int sum , ArrayList<Integer> ans){
        if(index>=arr.length){
            if(new_sum==sum){
                for(int i=0 ; i<ans.size() ; i++){
                    System.out.print(ans.get(i)+" ");
                }
                System.out.println();
            }
            return;
        }

        // adding the element...
        new_sum+=arr[index];
        ans.add(arr[index]);
        subsequence(arr , index+1 , new_sum , sum , ans);


        // removing the element...
        new_sum-=arr[index];
        ans.remove(ans.size()-1);
        subsequence(arr , index+1 , new_sum , sum , ans);
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

        subsequence(arr , 0 , 0 , sum , new ArrayList<Integer>());
    }
}
