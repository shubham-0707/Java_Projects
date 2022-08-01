package Practice.Recursion;
import java.util.*;

// Program to display array elements in reverse order using recursion.....
public class display_array_elements_in_reverse {
    public static void display_reverse(int[] arr , int idx){
        if(idx==arr.length){
            return;
        }
        display_reverse(arr , idx+1);
        System.out.print(arr[idx] + " ");
    }
    public static void main(String[] args) {
        int n;
        System.out.println("Enter n : ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter array elements : ");
        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Array elements in reverse order are : ");
        display_reverse(arr , 0);
    }
}
