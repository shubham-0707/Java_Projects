/*
Example 1:
Input: arr1[]= [1,3,4,5,2]
       arr2[]= [2,4,3,1,7,5,15]
Output: arr1[] is a subset of arr2[]

Example 2:
Input: arr1[]= [1,3,4,5,2]
       arr2[]= [4,5,2]
Output: arr1[] is not a subset of arr2[]

Example 3:
Input: arr1[]= [1,3,4,5,2]
       arr2[]= [11,12,13,15,16]
Output: arr1[] is not a subset of arr2[]

In this question we have to find that the second array is a subset of first array or not..
 */

package TCS_NQT_Striver_Sheet.Problems_on_Arrays;
import java.util.*;

public class Check_subset_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array 1 size : ");
        int n = sc.nextInt();
        //declaring and initialising the array...
        System.out.println("Enter array 1 elements : ");
        int[] arr = new int[n];
        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter array 2 size : ");
        int m = sc.nextInt();
        // declaring and initialising the array :
        int[] arr2 = new int[m];
        for(int i=0 ; i<m ; i++){
            arr2[i] = sc.nextInt();
        }

        // main implementation starts from here ..
        HashMap<Integer , Integer> hash = new HashMap<>();

        for(int i=0 ; i<n; i++){
            hash.put(arr[i] , hash.getOrDefault(arr[i] , 0)+1);
        }

        HashMap<Integer , Integer> hash2 = new HashMap<>();
        for(int i=0 ; i<m ; i++){
            hash2.put(arr2[i] , hash2.getOrDefault(arr2[i] , 0)+1);
        }

        boolean flag = true;
        for(int i=0 ; i<n ; i++){
            if(!hash2.containsKey(arr[i]) || hash2.get(arr[i])<hash.get(arr[i])){
                flag=false;
                break;
            }
        }

        if(flag==true){
            System.out.println("Array 1 is the subset of Array 2");
            return;
        }
        System.out.println("Array 1 is not the subset of Array 2");

        // Time Complexity : O(n)
        // Space Complexity : O(n)
    }
}
