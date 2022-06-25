package com.example.Hashing;
import java.util.*;

// Program to find the union of two arrays using hashing technique...
public class union_of_two_arrays {
    public static void main(String[] args) {
        System.out.println("Enter n : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the array element...");

        for(int i=0 ; i<n ; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter m : ");
        int m = sc.nextInt();

        int[] arr2 = new int[m];
        System.out.println("Enter the elements of 2nd element...");
        for(int i=0 ; i<m ; i++){
            arr2[i] = sc.nextInt();
        }

        HashSet<Integer> hash = new HashSet<Integer>();
        for(int i=0 ; i<arr.length ; i++){
            hash.add(arr[i]);
        }

        for(int i=0 ; i<arr2.length ; i++){
            hash.add(arr2[i]);
        }

        System.out.println("The union of the two arrays is ...");
        System.out.println(hash);

    }
}
