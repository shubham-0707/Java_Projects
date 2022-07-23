package Java_Problems.Java.com.example.Arrays;
import java.util.*;



// This program is made to find the next permutation of the array...
public class Next_Permutations {

    public static void swap(int[] arr , int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void reverse(int[] arr , int start , int end){
        while(start<end){
            swap(arr , start , end);
            start++;
            end--;
        }
    }
    public static void nextPermutation(int[] arr){
        int i=arr.length-2 ;
        while(i>=0 && arr[i]>=arr[i+1]){
            i--;
        }
        if(i>=0){
            int j = arr.length-1;
            while(arr[j]<=arr[i]){
                j--;
            }
            swap(arr , i  , j);
        }
        reverse(arr , i+1 , arr.length-1);

        // The next permutation is :
        System.out.println("Next permutation is : ");
        for(int x=0 ; x<arr.length ; x++){
            System.out.print(arr[x]+" ");
        }
        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }

        nextPermutation(arr);

        return;

    }

    // Time Complexity : O(n)
    // Space Complexity : O(1)
}
