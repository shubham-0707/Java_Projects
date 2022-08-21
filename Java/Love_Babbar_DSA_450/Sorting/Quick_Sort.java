/*

...Implementing the Quick Sort in this problem...

 */

package Love_Babbar_DSA_450.Sorting;
import java.util.*;




public class Quick_Sort {

    private static void swap(int[] arr , int start , int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }

    public static int partition(int[] arr , int start , int end){

        int pivot = arr[start];
        int count = 0;

        for(int i=start+1 ; i<=end ; i++){
            if(arr[i]<=pivot){
                count++;
            }
        }

        int pivotIndex = start+count;
        swap(arr  ,start ,  pivotIndex);

        int i=start;
        int j=end;

        while(i<pivotIndex && j>pivotIndex){
            while(arr[i]<=pivot){
                i++;
            }
            while(arr[j]>pivot){
                j--;
            }

            if(i<pivotIndex && j>pivotIndex){
                swap(arr , i++ , j--);
            }
        }

        return pivotIndex;

    }

    public static void quickSort(int[] arr , int start , int end){
        if(start<end){
            int pivot = partition(arr , start , end);
            quickSort(arr , start  , pivot-1);
            quickSort(arr , pivot+1 , end);
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

        quickSort(arr , 0 , arr.length-1);

        //printing the sorted array

        for(int i=0 ; i<arr.length ; i++){
            System.out.print(arr[i]+" ");
        }

        // Time Complexity : O(N*logN)
        // Space Complexity : O(1)

    }
}
