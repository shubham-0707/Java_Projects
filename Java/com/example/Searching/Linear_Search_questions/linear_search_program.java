package com.example.Searching.Linear_Search_questions;
import java.util.*;


// program to find the search element in the array...

/* Linear Search : In this searching technique every element is checked un till the key element is not found
in the array. If the array element is not found in the array then -1 is returned to the user.

Time Complexity : O(log(n)) because every element is checked for the key element..
* */
public class linear_search_program {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter n elements of the array : ");
        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the key element : ");
        int key = sc.nextInt();

        int pos = -1;
        for(int i=0 ; i<n ; i++){
            if(arr[i]==key){
                pos = i+1;
                break;
            }
        }

        System.out.println("The element found at "+pos+" position");

    }
}
