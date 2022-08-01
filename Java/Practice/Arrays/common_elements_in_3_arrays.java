package Practice.Arrays;
import java.util.*;


// This program is made to find the common elements in three sorted arrays...
public class common_elements_in_3_arrays {
    public static void main(String[] args) {
        Scanner  sc = new Scanner (System.in);

        int n = sc.nextInt();
        int[] arr1 = new int[n];

        for(int i=0 ; i<n ; i++){
            arr1[i] = sc.nextInt();
        }

        int m = sc.nextInt();
        int[] arr2 = new int[m];

        for(int i=0 ; i<m ; i++){
            arr2[i] = sc.nextInt();
        }

        int o = sc.nextInt();
        int[] arr3 = new int[o];

        for(int i=0 ; i<o ; i++){
            arr3[i] = sc.nextInt();
        }

        HashMap<Integer , Integer> hash1 = new HashMap<>();
        HashMap<Integer , Integer> hash2 = new HashMap<>();

        for(int i=0 ; i<n ; i++){
            hash1.put(arr1[i] , hash1.getOrDefault(arr1[i] , 0)+1);
        }

        for(int i=0 ; i<m ; i++){
            hash2.put(arr2[i] , hash2.getOrDefault(arr2[i] , 0)+1);
        }

        ArrayList<Integer> ans =  new ArrayList<>();
        for(int i=0 ; i<o ; i++){
            if(hash1.containsKey(arr3[i]) && hash1.get(arr3[i])>0){
                if(hash2.containsKey(arr3[i]) && hash2.get(arr3[i])>0){
                    ans.add(arr3[i]);
                    hash1.put(arr3[i] , 0);
                    hash2.put(arr3[i] , 0);
                }
            }
        }
        if(ans.size()==0){
            ans.add(-1);
        }

        System.out.println("The common elements in all the 3 arrays are ...");
        for(int i:ans){
            System.out.print(i+" ");
        }

        // Time Complexity : O(n)
        // Space Complexity : O(n) + O(n) + O(n) which is equivalent to O(n)

    }
}
