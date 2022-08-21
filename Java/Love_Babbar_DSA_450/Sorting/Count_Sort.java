/*

...This program is made to implement the count sort algorithm...

 */



package Love_Babbar_DSA_450.Sorting;
import java.util.*;

public class Count_Sort {

    public static void Count_Sort(int[] arr){
        int maxi = Integer.MIN_VALUE;
        for(int i=0 ; i<arr.length ; i++){
            maxi = Math.max(maxi , arr[i]);
        }

        int[] count = new int[maxi+1];

        for(int i=0 ; i<arr.length ; i++){
            count[arr[i]]++;
        }

        int k=0;
        for(int i=0 ; i<count.length ; i++){
            if(count[i]>0){
                while(count[i]>0){
                    arr[k++] = i;
                    count[i]--;
                }
            }
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //declaring and initialising the array...
        int[] arr = new int[n];

        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }

        Count_Sort(arr);

        //printing the sorted array...
        for(int i=0 ; i<n ; i++){
            System.out.print(arr[i]+" ");
        }

        // Time Complexity : O(N^2) but for small values it appears as O(N)
        // Space Complexity : O(N)
    }
}
