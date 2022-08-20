/*

...Union of two sorted arrays...

 */


package Love_Babbar_DSA_450.Array;
import java.util.*;

public class find_union_of_two_sorted_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input array1 size : ");
        int n = sc.nextInt();
        System.out.print("Input array2 size : ");
        int m = sc.nextInt();

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

        // we are going to store the elements in a hashset...
        Set<Integer> set = new HashSet<>();
        for(int i=0 ; i<n ; i++){
            set.add(arr1[i]);
        }
        for(int i=0 ; i<m ; i++){
            set.add(arr2[i]);
        }


        //the union of two arrays is :
        for(int i:set){
            System.out.print(i+" ");
        }

        // Time Complexity : O(N)
        // Space Complexity : O(N)
    }
}
