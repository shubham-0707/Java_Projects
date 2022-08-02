

/*
Example 1:
Input: (1,2),(2,1),(3,4),(4,5),(5,4)
Output: (2,1) (5,4)
Explanation: Since (1,2) and (2,1) are symmetric pairs and (4,5) and (5,4) are symmetric pairs.

Example 2:
Input: (1,5),(2,3),(4,2),(5,1),(2,4)
Output: (2,4) (5,1)
Explanation: Since (1,5) and (2,4) are symmetric pairs and (5,1) and (4,2) are symmetric pairs.


In this question we have to print the symmetric pairs of the array...

 */


package TCS_NQT_Striver_Sheet.Problems_on_Arrays;
import java.util.*;

public class find_symmetric_pairs_in_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // declaring and initialising the array...

        int[][] arr = new int[n][2];
        for(int i=0 ; i<n ; i++){
            for(int j=0 ; j<2 ; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        HashMap<Integer , Integer> hash = new HashMap<>();
        for(int i=0 ; i<arr.length ; i++){

            if(hash.containsKey(arr[i][1]) && hash.get(arr[i][1])==arr[i][0]){
                System.out.print("("+arr[i][0]+","+arr[i][1]+")"+" ");
            }
            else{
                hash.put(arr[i][0] , arr[i][1]);
            }
        }

        // Time Complexity : O(n)
        // Space Complexity : O(1)

    }
}
