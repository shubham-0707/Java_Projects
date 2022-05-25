package com.example.Searching.Binary_Search_questions;
import java.util.*;



// Program to find the index at which an element is to be inserted in a sorted array...

/* Time Complexity : The time complexity of this program is O(logn) because the binary search is implemented
in this program...
 */
public class search_insert_position {
    public static void main(String[] args) {
        System.out.println("Enter n : ");
        Scanner sc = new Scanner(System.in);
        int  n = sc.nextInt();

        System.out.println("Enter the sorted array elements : ");
        int[] arr = new int[n];
        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the element to be inserted : ");
        int key = sc.nextInt();

        System.out.print("The position of insertion is : ");
        if(Arrays.binarySearch(arr , key)>=0){
            System.out.println(Arrays.binarySearch(arr , key));
        }

        else{
            int start = 0;
            int end = arr.length-1;

            int mid = start + (end-start)/2;

            while(start<=end){
                if(arr[mid]<key){
                    start=mid+1;
                }
                else{
                    end=mid-1;
                }

                 mid = start + (end-start)/2;
            }

            System.out.println(mid);
        }

    }
}
