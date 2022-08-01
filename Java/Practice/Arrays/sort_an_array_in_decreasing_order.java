package Practice.Arrays;
import java.util.*;


public class sort_an_array_in_decreasing_order {

    public static void reverse(int[] arr){
        int start=0;
        int end = arr.length -1 ;

        while(start<=end){
            int temp = arr[start];
            arr[start]= arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter n : ");
        n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter array elements : ");

        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        reverse(arr);

        System.out.println("The sorted array in decreasing order is : ");
        for(int i: arr){
            System.out.print(i+" ");
        }


    }

}
