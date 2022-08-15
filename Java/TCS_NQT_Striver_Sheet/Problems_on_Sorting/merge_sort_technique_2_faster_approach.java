

/*

....Merge Sort technique 2 which is a faster way to approach this question...


 */


package TCS_NQT_Striver_Sheet.Problems_on_Sorting;
import java.util.*;

public class merge_sort_technique_2_faster_approach {

    public static void merge(int[] arr , int start , int mid , int end){

        int len1 = mid-start+1;
        int len2 = end-mid;

        int[] first = new int[len1];
        int[] second = new int[len2];

        int k=start;
        for(int i=0 ; i<len1 ; i++){
            first[i] = arr[k++];
        }
        k=mid+1;
        for(int i=0 ; i<len2 ; i++){
            second[i] = arr[k++];
        }
        k=start;

        int idx1 = 0;
        int idx2 = 0;
        while(idx1<len1 && idx2<len2){
            if(first[idx1]<second[idx2]){
                arr[k++] = first[idx1++];
            }
            else{
                arr[k++] = second[idx2++];
            }
        }

        while(idx1<len1){
            arr[k++] = first[idx1++];
        }

        while(idx2<len2){
            arr[k++] = second[idx2++];
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
        System.out.println("Enter the array size : ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }

        mergeSort(arr , 0 , n-1);

        //sorted array is ...
        System.out.println("The sorted array is : ");
        for(int i=0 ; i<n ; i++){
            System.out.print(arr[i]+" ");
        }

        // Time Complexity : O(n*log(n))
        // Space Complexity : O(n)
    }
}
