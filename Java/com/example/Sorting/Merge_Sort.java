package com.example.Sorting;
import java.util.*;


/* Time Complexity : The time complexity of the merge Sort is O(nlogn)... */

// Program to implement the merge sort in arrays...
public class Merge_Sort {


    public static void merge(int[] arr , int start , int end){
        int mid = (start+end)/2;

        int len1 = mid-start+1;
        int len2 = end - mid;

        int[] first = new int[len1];
        int[] second = new int[len2];

        int k = start;

        for(int i=0 ; i<len1 ; i++){
            first[i] = arr[k++];
        }

        k = mid+1;
        for(int i=0 ; i<len2 ; i++){
            second[i] = arr[k++];
        }

        k=start;
        int idx1 = 0;
        int idx2 = 0;
        while(idx1<len1 && idx2 < len2){
            if(first[idx1]<second[idx2]){
                arr[k++] = first[idx1++];
            }
            else{
                arr[k++] = second[idx2++];
            }
        }

        while(idx1<len1){
            arr[k++] = first[idx1++];
        }

        while(idx2<len2){
            arr[k++] = second[idx2++];
        }

    }

    public static void mergeSort(int[] arr , int start , int end){
        if(start>=end){
            return;
        }

        int mid = (start+end)/2;

        mergeSort(arr , start , mid);

        mergeSort(arr , mid+1 , end);

        merge(arr , start , end);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter n array elements : ");
        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }

        mergeSort(arr , 0 , n-1);

        System.out.println("The sorted array is : ");
        for(int i=0 ; i<n ; i++){
            System.out.print(arr[i] + " ");
        }

    }
}
