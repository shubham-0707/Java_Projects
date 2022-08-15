/*

...Selection Sort...

 */


package TCS_NQT_Striver_Sheet.Problems_on_Sorting;
import java.util.*;

public class Selection_Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size : ");
        int n = sc.nextInt();

        // declaring and initialising the array...
        int[] arr = new int[n];
        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }

        // Sorting process starts from here...
        for(int i=0 ; i<n ; i++){
            int minIdx = i;
            for(int j=i+1 ; j<n ; j++){
                if(arr[j]<arr[minIdx]){
                    minIdx = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = temp;
        }

        //sorted array is :
        System.out.println("The sorted array is : ");
        for(int i=0 ; i<n ; i++){
            System.out.print(arr[i]+" ");
        }

        // Time Complexity : O(N^2)
        // Space Complexity : O(1)
    }
}
