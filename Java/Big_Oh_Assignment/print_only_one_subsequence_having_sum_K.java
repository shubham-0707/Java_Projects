package Big_Oh_Assignment;
import java.util.*;

public class print_only_one_subsequence_having_sum_K {

    public static boolean subsequence(int[] arr , int index , int new_sum , int sum , ArrayList<Integer> ans){
        if(index>=arr.length){
            if(new_sum==sum){
                for(int i=0 ; i<ans.size() ; i++){
                    System.out.print(ans.get(i)+" ");
                }
                System.out.println();
                return true;
            }
            return false;
        }
        new_sum+=arr[index];
        ans.add(arr[index]);
        if(subsequence(arr , index+1 , new_sum , sum , ans)==true) return true;

        new_sum-=arr[index];
        ans.remove(ans.size()-1);
        if(subsequence(arr , index+1 , new_sum , sum , ans)==true) return true;

        return false;
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
