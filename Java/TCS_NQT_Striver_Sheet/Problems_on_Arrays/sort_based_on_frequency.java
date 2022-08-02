/*
In this question we have to sort the array based on the frequency of each element...

Example 1:
Input: N = 8, array[] = {1,2,3,2,4,3,1,2}
Output: 2 2 2 1 1 3 3 4
Explanation: Since  2 is present 3 times in an array , so print it 3 times ,then print ‘1’ 2 times and then ‘3’ 2 times and 4 has least frequency, it will be printed at last.

Example 2:
Input: N = 6, array[] = {-199,6,7,-199,3,5}
Output: -199 -199 3 5 6 7
Explanation: Since -199 is present 2 times so it will be printed at first , then 3 , 5 ,6 ,7 are present once in array , so print them in their sorted order.

 */

package TCS_NQT_Striver_Sheet.Problems_on_Arrays;
import java.util.*;

public class sort_based_on_frequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // declaring and initialising array...

        int[] arr = new int[n];
        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }

        LinkedHashMap<Integer , Integer> hash = new LinkedHashMap<>();
        for(int i=0 ; i<n ; i++){
            hash.put(arr[i] , hash.getOrDefault(arr[i] , 0)+1);
        }

        // Adding the hashmap keys and values in an arraylist...
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        for(int i:hash.keySet()){
            ArrayList<Integer> temp = new ArrayList<>();
            temp.add(hash.get(i));
            temp.add(i);
            ans.add(temp);
        }

        // Sorting the arraylist based on the first value of every sub array-list
        Collections.sort(ans , (a, b)->{
            if(a.get(0)==b.get(0)){
                return a.get(0)-b.get(0);
            }
            else{
                return b.get(0)-a.get(0);
            }
        });


        // Printing the resultant array...
        for(int i=0 ; i<ans.size() ; i++){
            for(int j=0 ; j<ans.get(i).get(0) ; j++){
                System.out.print(ans.get(i).get(1)+" ");
            }
            System.out.println();
        }

    }
}
