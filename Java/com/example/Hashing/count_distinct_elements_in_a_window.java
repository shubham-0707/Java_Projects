package com.example.Hashing;
import java.util.*;

// This program is made to count the total distinct elements in a window of size "K".....
public class count_distinct_elements_in_a_window {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i=0 ; i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the window size : ");
        int k = sc.nextInt();

        HashMap<Integer , Integer> hash = new HashMap<>();
        for(int i=0 ; i<k ; i++) {
            hash.put(arr[i], hash.getOrDefault(arr[i], 0) + 1);
        }
        System.out.println(hash.size());

        int x = 0;
        for(int i=k ; i<arr.length ; i++) {
            if (hash.get(arr[x]) == 1) {
                hash.remove(arr[x]);
            } else if (hash.get(arr[x]) > 1) {
                hash.put(arr[x], hash.getOrDefault(arr[x], 0) - 1);
            }
            hash.put(arr[i], hash.getOrDefault(arr[i], 0) + 1);
            System.out.println(hash.size());
            x++;
        }

    }

    // Shubham Singh
}
