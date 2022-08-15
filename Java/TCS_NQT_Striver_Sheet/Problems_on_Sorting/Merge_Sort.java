/*

...Merge Sort...

 */

package TCS_NQT_Striver_Sheet.Problems_on_Sorting;
import java.util.*;

public class Merge_Sort {

    public static void merge(int[] arr , int start , int mid , int end){
        int i=start;
        int j = mid+1;

        int[] temp = new int[100000];
        int k = start;

        while(i<=mid && j<=end){
            if(arr[i]<arr[j]){
                temp[k] = arr[i];
                i++;
                k++;
            }
            else {
                temp[k] = arr[j];
                k++;
                j++;
            }
        }

        while(i<=mid){
            temp[k] = arr[i];
            i++;
            k++;
        }

        while(j<=end){
            temp[k] = arr[j];
            j++;
            k++;
        }

        // printing the sorted array...
        for(int x=start ; x<=end ; x++){
            arr[x] = temp[x];
        }
    }

    public static void mergeSort(int[] arr , int start , int end){
        if(start<end){
            int mid = (start+end)/2;
            mergeSort(arr , start , mid);
            mergeSort(arr , mid+1 , end);
            merge(arr , start , mid , end);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements : ");
        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }

        mergeSort(arr , 0 , arr.length-1);

        for(int i=0 ; i<arr.length ; i++){
            System.out.print(arr[i]+" ");
        }

        // Time Complexity : O(n*log(n))
        // Space Complexity : O(1)

    }

}
