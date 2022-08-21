/*

...In this question I am going to implement selection sort...

-> Algorithm
-> In this algorithm firstly we find out the lowest element index
-> Then we swap that element with the ith index at every pass of ith loop
-> In this way we get a sorted array when all the iteration of ith loop ends...

 */


package Love_Babbar_DSA_450.Sorting;
import java.util.*;


public class Selection_Sort {

    private static void swap(int[] arr , int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void selection_sort(int[] arr){


        for(int i=0 ; i<arr.length ; i++){
            int minIdx = i;
            for(int j=i+1 ; j<arr.length ; j++){
                if(arr[j]<arr[minIdx]){
                    minIdx = j;
                }
            }

            swap(arr , i , minIdx);
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

        selection_sort(arr);

        // printing the  sorted array from selection sort

        for(int i=0 ; i<arr.length ; i++){
            System.out.print(arr[i]+" ");
        }

        // Time Complexity : O(N^2)
        // Space Complexity : O(1)


    }
}
