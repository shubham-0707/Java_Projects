package com.example.Arrays;
import java.util.*;

public class one_D_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the size of the array : ");
        n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter the array elements : ");
        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }

        // Printing the array elements...

        for(int i:arr){
            System.out.println(i);
        }

    }
}
