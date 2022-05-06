package com.example.Arrays;
import java.util.*;

// This is the program to rotate an array right....

public class rotate_an_array {

    public static void rotate(int[] arr , int start , int end){
        while(start<=end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void display(int[] arr){
        System.out.println("The elements of your array are...");
        for(int i:arr){
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        int n;
        System.out.println("Enter the length of the array : ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        System.out.println("Enter "+n+" elements of array : ");
        int arr[] = new int[n];
        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }

        int k;
        System.out.println("Enter the number of elements to be rotated right : ");
        k = sc.nextInt();



        k = k%arr.length;
        rotate(arr , 0 , n-1);
        rotate(arr , 0 , k-1);
        rotate(arr , k , n-1);
        display(arr);
    }
}
