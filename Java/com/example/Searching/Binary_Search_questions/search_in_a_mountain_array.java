package com.example.Searching.Binary_Search_questions;
import java.util.*;

public class search_in_a_mountain_array {


    // Program to search element index in a mountain array using binary search..
    public static int findPeak(int[] arr){
        int start = 0;
        int end = arr.length-1;
        int peak = -1;

        while(start<end){
            int mid = start + (end - start)/2;

            if(arr[mid]<arr[mid+1]){
                start = mid+1;
                peak = mid+1;
            }
            else if(arr[mid]>arr[mid+1]){
                end = mid;
                peak = mid;
            }
        }

        return peak;
    }


    public static int BinarySearch(int[] arr , int start , int end , int key){
        while(start<=end){
            int mid = start+(end-start)/2;

            if(arr[mid]==key){
                return mid;
            }
            else if(arr[mid]<key){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }

        return -1;
    }


    public static void main(String[] args) {
        System.out.println("Enter n : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the array elements : ");
        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the search element : ");
        int B = sc.nextInt();

        int peak =findPeak(arr);


        if(B == arr[peak]){
            System.out.println("Index : "+peak);
        }

        else if(B<arr[peak]){
            System.out.println("Index : "+BinarySearch(arr , 0 , peak-1 , B));
        }
        else {
            System.out.println("Index : " + BinarySearch(arr, peak + 1, arr.length - 1, B));
        }
    }
}
