
/*

...In this question I am going to implement the merge Sort algorithm...

-> Algorithm:

-> In this algo. we break the array until all the elements becomes an array of  a single element...
-> Then we merge that single elements based on their values...
->That's why this algorithm is also called as the divide and conquer algorithm.

 */

package Love_Babbar_DSA_450.Sorting;
import java.util.*;

public class Merge_Sort {

    public static void merge(int[] arr , int start , int mid , int end){
        int len1 = mid-start+1;
        int len2 = end-mid;

        int k = start;
        int[] arr1 = new int[len1];
        int[] arr2 = new int[len2];

        for(int i=0 ; i<len1 ; i++){
            arr1[i] = arr[k++];
        }
        k=mid+1;
        for(int i=0 ; i<len2 ; i++){
            arr2[i] = arr[k++];
        }

        k=start;
        int idx1 = 0;
        int idx2 = 0;
        while(idx1<len1 && idx2<len2){
            if(arr1[idx1]<=arr2[idx2]){
                arr[k++] = arr1[idx1++];
            }
            else{
                arr[k++] = arr2[idx2++];
            }
        }

        while(idx1<len1){
            arr[k++] = arr1[idx1++];
        }

        while(idx2<len2){
            arr[k++] = arr2[idx2++];
        }
    }


    public static void mergeSort(int[] arr , int start , int end){


        if(start<end){
            int mid = start + (end-start)/2;

            mergeSort(arr , start , mid);
            mergeSort(arr , mid+1 , end);
            merge(arr , start , mid , end);
        }

    }




    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //declare and initialise the array...
        int[] arr = new int[n];

        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }

        mergeSort(arr , 0 , arr.length-1);

        //printing the sorted array...
        for(int i=0 ; i<n ; i++){
            System.out.print(arr[i]+" ");
        }

        // Time Complexity : O(N*logN)
        // Space Complexity : O(N)
    }
}
