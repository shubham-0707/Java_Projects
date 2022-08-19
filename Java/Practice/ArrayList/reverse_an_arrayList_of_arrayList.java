/*

...This question is just to check the reverse function of the arrayList in java...

 */


package Practice.ArrayList;
import java.util.*;

public class reverse_an_arrayList_of_arrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        for(int i=0 ; i<n ; i++){
            int m = sc.nextInt();
            ArrayList<Integer> temp = new ArrayList<>();
            for(int j=0 ; j<m ; j++){
                int a = sc.nextInt();
                temp.add(a);
            }
            ans.add(temp);
        }

        Collections.reverse(ans);

        System.out.println("The reversed arraylist is : ");
        for(int i=0 ; i<ans.size() ; i++){
            for(int j=0 ; j<ans.get(i).size() ; j++){
                System.out.print(ans.get(i).get(j)+" ");
            }
            System.out.println();
        }



    }
}
