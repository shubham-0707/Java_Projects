package com.example.Recursion;
import java.util.*;


// program to display all the elements of an array using recursion....
public class display_array_elements {

    public static void display(int[] arr , int idx){
        if(idx==arr.length){
            return;
        }
        System.out.print(arr[idx]+" ");
        display(arr , idx+1);
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

        System.out.println("Array elements are : ");
        display(arr, 0);

    }
}
