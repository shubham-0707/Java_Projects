package Big_Oh_Assignment;
import java.util.*;

public class printing_all_subsequences_using_recursion {

    public static void subsequence(int[] arr , int index , ArrayList<Integer> ans){
        if(index>=arr.length){
            for(int i=0 ; i<ans.size() ; i++){
                System.out.print(ans.get(i)+" ");
            }
            System.out.println();
            return;
        }
        ans.add(arr[index]);
        subsequence(arr , index+1 , ans);

        ans.remove(ans.size()-1);
        subsequence(arr , index+1 , ans);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
         for(int i=0 ; i<n ; i++){
             arr[i] = sc.nextInt();
         }
         ArrayList<Integer> ans = new ArrayList<>();
         subsequence(arr , 0 , ans);


    }
}
