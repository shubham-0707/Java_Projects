package com.example.Searching.Binary_Search_questions;
import java.util.*;



// Program to calculate the total number of 1's in the array...
public class calculate_1s {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }

        int start = 0;
        int end = n-1;
        int pivot = 0;

        while(start<end){
            int mid = start + (end-start)/2;


            if(arr[mid]>=arr[0]){
                start=mid+1;

            }
            else{
                end = mid;
                pivot =  mid;

            }
        }

        System.out.println(pivot);
    }
}
