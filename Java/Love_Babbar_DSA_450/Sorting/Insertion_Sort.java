/*

...In this question I am going to implement the insertion Sort...

-> Algorithm:

-> use a for loop from the second element of the array
-> and can check for the elements larger than the element in the backward of the element
-> then inserting that element at its correct position...

 */


package Love_Babbar_DSA_450.Sorting;
import java.util.*;

public class Insertion_Sort {


    public static void insertion_sort(int[] arr){

        for(int i=1 ; i<arr.length ; i++){
            int key = arr[i];
            int j = i-1;

            while(j>=0 && arr[j]>=key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
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

        // passing the array in my insertion_sort function...
        insertion_sort(arr);

        //printing the array...
        for(int i=0 ; i<n ; i++){
            System.out.print(arr[i]+" ");
        }

        // Time Complexity : O(N^2)
        // Space Complexity : O(1)
    }
}
