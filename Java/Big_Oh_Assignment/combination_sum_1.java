package Big_Oh_Assignment;
import java.util.*;

public class combination_sum_1 {

    public static void combinations(int[] arr , int index , int sum , ArrayList<Integer> temp , ArrayList<ArrayList<Integer>> ans){
        if(sum<0) return;

        if(index==arr.length){
            if(sum==0){
                ans.add(new ArrayList<>(temp));
            }
            return;
        }


        temp.add(arr[index]);
        combinations(arr , index , sum-arr[index] , temp , ans);

        temp.remove(temp.size()-1);
        combinations(arr , index+1 , sum , temp , ans);
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

        ArrayList<Integer> temp = new ArrayList<>();
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        combinations(arr , 0 , sum , temp , ans);

        for(int i=0 ; i<ans.size() ; i++){
            for(int j=0 ; j<ans.get(i).size() ; j++){
                System.out.print(ans.get(i).get(j)+" ");
            }
            System.out.println();
        }
    }
}
