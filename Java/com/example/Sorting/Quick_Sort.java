package com.example.Sorting;
import java.util.*;


// Program to implement the quick Sort in arrays...
public class Quick_Sort {

    public static int partition(int[] arr  , int low , int high){
        int pivot = arr[high];
        int i=low-1;

        for(int j=low ; j<high ; j++){
            if(arr[j]<pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = arr[high];
        arr[high] = temp;

        return i;
    }

    public static void quickSort(int[] arr , int low , int high){
        if(low<high){
            int pindx = partition(arr , low , high);

            quickSort(arr , low , pindx-1);

            quickSort(arr , pindx+1 , high);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }

        quickSort(arr , 0 , n-1);


        System.out.println("The sorted array is...");

        for(int i=0 ; i<n ; i++){
            System.out.print(arr[i]+" ");
        }
    }

 }
