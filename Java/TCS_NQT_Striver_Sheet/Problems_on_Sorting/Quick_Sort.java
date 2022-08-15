/*

...Quick Sort...

 */


package TCS_NQT_Striver_Sheet.Problems_on_Sorting;
import java.util.*;

public class Quick_Sort {

    public static void swap(int[] arr , int start , int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }

    public static int Partition(int[] arr , int start , int end){

        int pivot = arr[start];
        int count = 0;
        for(int i=start+1 ; i<=end ; i++){
            if(arr[i]<=pivot){
                count++;
            }
        }
        int pivotIndex = start+count;
        swap(arr , start , pivotIndex);

        // left aur right ko sambhal lena hai...

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
    public static void QuickSort(int[] arr , int start , int end){
        if(start<end){
            int pivot = Partition(arr , start , end);
            QuickSort(arr , start , pivot-1);
            QuickSort(arr , pivot+1 , end);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size : ");
        int n = sc.nextInt();

        // declaring and initialising the array....
        int[] arr = new int[n];
        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }

        // calling the QuickSort function..
        QuickSort(arr , 0 , arr.length-1);

        // printing the sorted array...
        for(int i=0 ; i<arr.length ; i++){
            System.out.print(arr[i]+" ");
        }

        // Time Complexity : O(n*log(n))
        // Space Complexity : O(n)
    }
}
