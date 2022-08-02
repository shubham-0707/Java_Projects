

/*

Example 1:
Input: 20 15 26 2 98 6
Output: 4 3 5 1 6 2
Explanation: When sorted,the array is 2,6,15,20,26,98. So the rank of 2 is 1,rank of 6 is 2,rank of 15 is 3 and so…

Example 2:
Input: 1 5 8 15 8 25 9
Output: 1 2 3 5 3 6 4
Explanation: When sorted,the array is 1,5,8,8,9,15,25. So the rank of 1 is 1,rank of 5 is 2,rank of 8 is 3 and so…

 */


package TCS_NQT_Striver_Sheet.Problems_on_Arrays;
import java.util.*;

public class replace_elements_by_rank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // declaring and initialising the array..

        int[] arr = new int[n];
        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }

        /*
        Approach 1 :
        In this approach we will use nested loops and store the rank of every element in a new array

        time Complexity : O(n^2)
        space Complexity : O(n)

         */

        /*
        Approach 2 : we will sort the array and then  we will store the rank of every element in a hashmap
         */

        Arrays.sort(arr);
        HashMap<Integer , Integer> hash = new HashMap<>();


        for(int i=0 ; i<n ; i++){
            hash.put(arr[i] , i+1);
            System.out.println(arr[i]+" has a rank "+hash.get(arr[i]));
        }

        // Time Complexity : O(n)
        // Space Complexity : O(n)

    }
}
