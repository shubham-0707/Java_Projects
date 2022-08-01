package Practice.Searching.Binary_Search_questions;
import java.util.*;

/*
Binary Search: In this binary search the array should be sorted to search any element in that array.

Time Complexity: The time complexity of binary search is O(log(n)) because at every iteration the array to be searched becomes half..

* */

public class binary_search_program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the size of the array : ");
        n = sc.nextInt();


        System.out.println("Enter n elements of the array in sorted array : ");
        int[] arr = new int[n];
        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }

        int key;
        System.out.println("Enter the key to be searched : ");
        key = sc.nextInt();
        int start = 0;
        int end = arr.length-1;
        int pos=-1;
        while(start<=end){
            int mid = start+(end-start)/2;

            if(arr[mid]==key){
                pos=mid;
                break;
            }
            else if(arr[mid]<key){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }

        System.out.println("The index at which the element is found is "+pos+1);

    }
}
