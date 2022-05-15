package com.example.Recursion;
import java.util.*;

// Program to find the maximum element in an array using recursion....
public class max_in_an_array {
    public static int maxInArray(int[] arr , int idx , int maxi){

        if(idx==arr.length){
            return maxi;
        }
        maxi = Math.max(maxi , arr[idx]);
        return maxInArray(arr , idx+1 , maxi);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter n : ");
        n = sc.nextInt();

        int arr[] = new int[n];
        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Max element in array is : "+maxInArray(arr , 0 , Integer.MIN_VALUE));

    }
}
