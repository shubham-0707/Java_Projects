/*
In this question we have to sort half the array as increasing and next half of the array as deceasing

 */



package TCS_NQT_Striver_Sheet.Problems_on_Arrays;
import java.util.*;

public class Print_increasing_decreasing_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }

        /*

        Approach 1 : In this approach I have sorted the array in increasing order and then make the array
        descending in next half of the array...

         */

        Arrays.sort(arr);

        int start = n/2;
        int end = arr.length-1;


        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

        System.out.println("The increasing-decreasing array is : ");
        for(int i=0 ; i<n  ; i++){
            System.out.print(arr[i]+" ");
        }

    }
}
