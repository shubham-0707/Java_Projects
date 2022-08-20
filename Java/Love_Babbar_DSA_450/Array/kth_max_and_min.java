/*

...Kth max and min in an array...

 */



package Love_Babbar_DSA_450.Array;
import java.util.*;

public class kth_max_and_min {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // declaring and initialising the array...

        int[] arr = new int[n];
        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt();

        //removing all the duplicates from the array...
        TreeMap<Integer , Integer> tree = new TreeMap<>();
        for(int i=0 ; i<n ; i++){
            tree.put(arr[i] , tree.getOrDefault(arr[i] , 0)+1);
        }

        int mini = 0, maxi=0;
        int maxPos = tree.size()-k;

        int x = 0;
        for(int i : tree.keySet()){
            if(x==k-1){
                mini = i;
            }
            if(x==maxPos){
                maxi = i;
                break;
            }
            x++;
        }

        System.out.println("Kth minimum is : "+mini);
        System.out.println("Kth maximum is : "+maxi);

        // Time Complexity : O(N)
        // Space Complexity : O(N) due to use of a treemap...

    }
}
