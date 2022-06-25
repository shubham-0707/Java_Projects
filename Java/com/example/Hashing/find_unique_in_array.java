package com.example.Hashing;
import java.util.*;

// This is the program to find the number of unique elements in an array...
public class find_unique_in_array {
    public static void main(String[] args) {
        System.out.println("Enter n : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements of the array...");
        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }

        HashSet<Integer> hash = new HashSet<>();
        for(int i=0 ; i<arr.length ; i++){
            hash.add(arr[i]);
        }
        System.out.println("The total number of the unique elements in the array is : "+hash.size());
    }
}
