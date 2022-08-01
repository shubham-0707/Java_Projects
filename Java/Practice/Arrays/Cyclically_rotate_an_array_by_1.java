package Practice.Arrays;
import java.util.*;


// Program to cyclically rotate an array by 1 place...
public class Cyclically_rotate_an_array_by_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new  int[n];

        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }

        int temp = arr[0];
        for(int i=1 ; i<n ; i++){
            arr[i-1] = arr[i];
        }
        arr[n-1] = temp;

        System.out.println("Rotated array is : ");
        for(int i=0 ; i<n ; i++){
            System.out.print(arr[i]+" ");
        }
        return;
    }
}
