package Big_Oh_Assignment;
import java.util.*;

public class combinations_sum_2 {

    public static void combinations2(int[] arr , int index , int sum , ArrayList<Integer> temp , Set<ArrayList<Integer>> ans){
        if(sum<0) return;

        if(index==arr.length){
            if(sum==0){
                ans.add(new ArrayList<>(temp));
            }
            return;
        }

        //adding...
        temp.add(arr[index]);
        combinations2(arr , index , sum-arr[index] , temp , ans);

        //removing...
        temp.remove(temp.size()-1);
        combinations2(arr , index+1 , sum , temp , ans);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        ArrayList<Integer> temp = new ArrayList<>();
        Set<ArrayList<Integer>> ans = new HashSet<>();

        System.out.println("Enter the sum required : ");
        int sum = sc.nextInt();

        combinations2(arr , 0 , sum , temp , ans);

        for(ArrayList<Integer> x : ans){
            for(int i=0 ; i<x.size() ; i++){
                System.out.print(x.get(i)+" ");
            }
            System.out.println();
        }


    }
}
