package Practice.Arrays;
import java.util.*;

public class array_using_functions {

    public static void insert(int[] arr , int n) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array elements : ");
        for(int i=0 ; i<n ; i++) {
            arr[i] = sc.nextInt();
        }
    }

    public static void display(int[] arr) {
        System.out.println("the array elements are ...");
        for(int i:arr) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the size : ");
        n = sc.nextInt();

        int arr[] = new int[n];

        insert(arr , n);
        display(arr);
    }
}
