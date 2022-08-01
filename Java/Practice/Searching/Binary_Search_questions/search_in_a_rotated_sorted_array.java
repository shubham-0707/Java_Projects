package Practice.Searching.Binary_Search_questions;
import java.util.*;

public class search_in_a_rotated_sorted_array {

    public static int findMin(int[] arr){
        int start = 0;
        int end = arr.length-1;
        int idx = -1;
        while(start<end){
            int mid = start + (end-start)/2;

            if(arr[mid]<arr[mid+1]){
                idx = mid;
                end = mid;
            }
            else{
                idx = mid+1;
                start=mid+1;
            }
        }
        return idx;
    }

    public static void main(String[] args) {
        System.out.println("Enter n : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println("Enter array elements : ");
        int[] arr = new int[n];

        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }

        int idx = findMin(arr);
        System.out.println("Index : "+idx);

    }
}

