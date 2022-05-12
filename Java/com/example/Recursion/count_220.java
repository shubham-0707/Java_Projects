package com.example.Recursion;
import java.util.*;


// Program to find check that the array contain the 10 times the array element or not....
public class count_220 {
    public static boolean binary_search(int[] arr  , int key){
        int start=0;
        int end = arr.length-1;

        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid]==key){
                return true;
            }
            else if(arr[mid]<key){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return false;
    }
    public static boolean check220(int[] arr , int idx){
        if(idx==arr.length) {
            return false;
        }
        else if(binary_search(arr , arr[idx]*10)){
            return true;
        }
        return check220(arr , idx+1);
    }

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter the array elements : ");
        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        System.out.println("contain element ? : "+check220(arr , 0));
    }
}
