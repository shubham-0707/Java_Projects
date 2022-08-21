/*

...In this sorting algorithm I am going to sort an array...

 */

package Love_Babbar_DSA_450.Sorting;
import javax.xml.transform.Source;
import java.util.*;

public class Bubble_Sort {

    private static void swap(int[] arr ,int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void bubble_sort(int[] arr){

        int n = arr.length;

        for(int i=0 ; i<n ; i++){
            for(int j=i+1 ; j<n ; j++){
                if(arr[i]>arr[j]){
                    swap(arr , i , j);
                }
            }
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

         //declare and initialise the array..
        int[] arr = new int[n];
        for(int i=0 ; i<n; i++){
            arr[i] = sc.nextInt();
        }

        bubble_sort(arr);

        // printing the sorted array...
        for(int i=0 ; i<n ; i++){
            System.out.print(arr[i]+" ");
        }

        // Time Complexity : O(N^2)
        // Space Complexity : O(1)
    }
}
