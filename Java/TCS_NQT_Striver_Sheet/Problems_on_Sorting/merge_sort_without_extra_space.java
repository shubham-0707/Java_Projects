/*

...Merge Sort without extra space...

 */


package TCS_NQT_Striver_Sheet.Problems_on_Sorting;
import java.util.*;

public class merge_sort_without_extra_space {

    public static void merge(int[] arr , int start , int mid , int end , int maxi){

        int i=start;
        int j = mid+1;
        int k = start;

        while(i<=mid && j<=end){
            if((arr[i]%maxi)<=(arr[j]%maxi)){
                arr[k] = arr[k] + (arr[i]%maxi)*maxi;
                i++;
            }
            else{
                arr[k] = arr[k] + (arr[j]%maxi)*maxi;
                j++;
            }
            k++;
        }

        while(i<=mid){
            arr[k] = arr[k] + (arr[i]%maxi)*maxi;
            i++;
            k++;
        }

        while(j<=end){
            arr[k] = arr[k] + (arr[j]%maxi)*maxi;
            j++;
            k++;
        }

        for(int x=start ; x<=end ; x++){
            arr[x] = arr[x]/maxi;
        }

    }

    public static void mergeSortRecur(int[] arr , int start , int end , int maxi){
        if(start<end){
            int mid = start + (end-start)/2;
            mergeSortRecur(arr , start , mid , maxi);
            mergeSortRecur(arr , mid+1 , end , maxi);
            merge(arr , start , mid , end , maxi);
        }
    }

    public static void mergeSort(int[] arr){
        int maxi = Integer.MIN_VALUE;
        for(int i=0 ; i<arr.length ; i++){
            maxi = Math.max(maxi , arr[i]);
        }

        maxi = maxi+1;
        mergeSortRecur(arr , 0 , arr.length-1 , maxi);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size : ");
        int n = sc.nextInt();
        System.out.println("Enter array elements : ");
        int[] arr = new int[n];
        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }

        mergeSort(arr);

        // sorted array is...
        System.out.println("The sorted array is : ");
        for(int i=0 ; i<n ; i++){
            System.out.print(arr[i]+" ");
        }

        // Time Complexity : O(n*log(n))
        // Space Complexity : O(1)
    }
}
