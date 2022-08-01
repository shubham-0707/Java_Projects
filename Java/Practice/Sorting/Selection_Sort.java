package Practice.Sorting;
import java.util.*;

/* Time Complexity : The time complexity of the Selection Sort is O(n square) */
// Program to implement Selection Sort ...
public class Selection_Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements : ");
        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }

        // Selection Sort process begins from here..

        for(int i=0 ; i<n ; i++){
            int minidx = i;
            for(int j=i+1 ; j<n ; j++){
                if(arr[j]<arr[minidx]){
                    minidx = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minidx];
            arr[minidx] = temp;
        }

        System.out.println("The sorted array is : ");
        for(int i=0 ; i<n ; i++){
            System.out.print(arr[i] + " ");
        }

    }
}
