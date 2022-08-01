package Practice.Sorting;
import java.util.*;

// Program to implement bubble sort in array...

/* Time Complexity : The time complexity of Bubble Sort is O(n square) */
public class Bubble_Sort {
    public static void main(String[] args) {
        System.out.println("Enter n : ");
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the array elements : ");
        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }

        // Bubble Sort process begins here..

        for(int i=0 ; i<n ; i++){
            for(int j=i+1 ; j<n ; j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println("The sorted array is : ");
        for(int i=0 ; i<n ; i++){
            System.out.print(arr[i] + " ");
        }


    }
}
