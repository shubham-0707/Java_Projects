package Big_Oh_Assignment;
import java.util.*;

public class reverse_an_array_using_recursion {

    public static void reverse(int[] arr , int start , int end){
        if(start<end){

            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
            reverse(arr , start , end);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }

        reverse(arr , 0 , n-1);

        System.out.println("This is the reversed array : ");
        for(int i=0 ; i<n ; i++){
            System.out.print(arr[i]+" ");
        }
    }

}
