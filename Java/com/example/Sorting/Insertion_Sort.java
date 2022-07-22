package Java_Problems.Java.com.example.Sorting;
import java.util.*;

// Program to implement insertion sort...

/* Time Complexity : The time complexity of the insertion sort is : O(n square) */

public class Insertion_Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i=0 ; i<n  ; i++){
            arr[i] = sc.nextInt();
        }

       // Insertion sort process starts from here...

        for(int i=1 ; i<n ; i++){
            int j=i-1;
            int key = arr[i];

            while(j>=0 && key<arr[j]){
                arr[j+1] = arr[j];
                j=j-1;
            }
            arr[j+1] = key;
        }

        System.out.println("The sorted array is...");
        for(int x:arr){
            System.out.print(x+" ");
        }
    }
}
