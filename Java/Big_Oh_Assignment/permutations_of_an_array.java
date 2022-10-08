package Big_Oh_Assignment;
import java.util.*;


public class permutations_of_an_array {

    public static void solve(int[] arr , List<Integer> temp , List<List<Integer>> ans , boolean[] bool){
        if(temp.size()==arr.length){
            ans.add(new ArrayList<>(temp));
            return;
        }

        for(int i=0 ; i<arr.length ; i++){

            if(!bool[i]){
                bool[i] = true;
                temp.add(arr[i]);
                solve(arr , temp , ans , bool);
                temp.remove(temp.size()-1);
                bool[i] = false;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }

        List<Integer> temp = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        boolean[] bool = new boolean[arr.length];

        solve(arr , temp , ans , bool);

        for(int i=0 ; i<ans.size() ; i++){
            for(int j=0 ; j<ans.get(i).size() ; j++){
                System.out.print(ans.get(i).get(j)+" ");
            }
            System.out.println();
        }

    }
}
