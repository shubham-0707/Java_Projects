package com.example.Sorting;
import java.util.*;


// Program to implement the count sort in the input array by the user...

// In this sorting method the range of the values should be given of the array values...
// For this question  0<=arr[i]<=100

// here the range of the elements in the array is from 0 to 100 , if the range goes from negative elements to positive
// elements then negative element is added to the index of the array in which the element is to be added.
public class Count_Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter n : ");
        n = sc.nextInt();

        System.out.println("Enter n elements : ");
        int arr[] = new int[n];
        for(int i=0 ; i<n; i++ ){
            arr[i] = sc.nextInt();
        }

        int count[] = new int[101];
        for(int i=0 ; i<n ; i++){
            count[arr[i]]++;
        }

        // Filling the array with the sorted elements..

        int k=0;
        for(int i=0 ; i<100 ; i++){
            if(count[i]>0){
                while(count[i]-- >0){
                    arr[k]=i;
                    k++;
                }
            }
        }

        // Sorted array is :
        System.out.println("Sorted array is : ");
        for(int i:arr){
            System.out.print(i+ " ");
        }
    }
}
