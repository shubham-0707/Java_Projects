package Practice.Searching.Binary_Search_questions;
import java.util.*;


// Program to find an element's index in a mountain array using binary search...
public class search_in_a_mountain_array {

    public static int findPeak(int[] arr){
        int start = 0;
        int end = arr.length-1;
        int peak = -1;

        while(start<end){
            int mid = start + (end-start)/2;
            if(arr[mid]<arr[mid+1]){
                peak = start+1;
                start = mid+1;
            }
            else{
                peak = mid;
                end = mid;
            }
        }
        return peak;
    }

    public static int BinarySearch(int[] arr , int start , int end , int key){
        while(start<=end){
            int mid = start + (end-start)/2;

            if(arr[mid]==key){
                return mid;
            }
            else if(arr[mid]<key){
                start = mid+1;
            }
            else{
                end = key-1;
            }
        }
        return -1;
    }

    public static int revBinarySearch(int[] arr , int start , int end , int key){
        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid]==key){
                return mid;
            }
            else if(arr[mid]<key){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter n array elements : ");
        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the search element : ");
        int key = sc.nextInt();

        int peak = findPeak(arr);

        if(arr[peak]==key){
            System.out.println("Index : "+peak);
        }
        else{
            int res = BinarySearch(arr , 0 , peak-1 , key);

            if(res==-1){
                res = revBinarySearch(arr , peak+1 , arr.length-1 , key);
            }
            System.out.println("Index : "+res);
        }

    }
}
