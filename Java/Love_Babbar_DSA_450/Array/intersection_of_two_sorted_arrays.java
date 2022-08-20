/*

...Intersection of two sorted arrays...

 */


package Love_Babbar_DSA_450.Array;
import java.util.*;

public class intersection_of_two_sorted_arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array1 size : ");
        int n = sc.nextInt();
        System.out.print("Enter array2 size : ");
        int m = sc.nextInt();

        //declaring both the arrays...
        int[] arr1 = new int[n];
        int[] arr2 = new int[m];

        System.out.println("Enter array1 elements : ");
        for(int i=0 ; i<n ; i++){
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter array2 elements : ");
        for(int i=0 ; i<m ; i++){
            arr2[i] = sc.nextInt();
        }

        HashMap<Integer , Integer> hash = new HashMap<>();
        for(int i=0 ; i<n ; i++){
            hash.put(arr1[i] , hash.getOrDefault(arr1[i] , 0)+1);
        }
        for(int j=0 ; j<m ; j++){
            hash.put(arr2[j] , hash.getOrDefault(arr2[j] , 0)+1);
        }

        for(int i:hash.keySet()){
            if(hash.get(i)>=2){
                System.out.print(i+" ");
            }
        }

        // Time Complexity : O(N)
        // Space Complexity : O(N)


    }
}
