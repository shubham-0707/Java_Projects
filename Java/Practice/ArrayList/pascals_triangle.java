/*

...Pascals Triangle...

 */



package Practice.ArrayList;
import java.util.*;

public class pascals_triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        for(int i=1 ; i<=n ; i++){
            int c = 1;
            ArrayList<Integer> temp = new ArrayList<>();

            for(int j=1 ; j<=i ; j++){
                temp.add(c);
                c = c*(i-j)/j;
            }

            ans.add(temp);
        }

        for(int i=0 ; i<ans.size() ; i++){
            for(int j=0 ; j<ans.get(i).size() ; j++){
                System.out.print(ans.get(i).get(j)+" ");
            }
            System.out.println();
        }



    }
}
