package com.example.Recursion;
import java.util.*;

public class Subsequence_Sum_equal_K {


    public static void subsequence_sum(int i , int[] ans  , int k ,  ArrayList<Integer> arr  , int sum){
        if(sum==k && i==ans.length){
            for(int x=0 ; x<arr.size() ; x++){
                System.out.print(arr.get(x)+" ");
            }
        }
        arr.add(ans[i]);
        subsequence_sum(i+1 , ans , k , arr , sum+ans[i]);
        arr.remove(arr.size()-1);
        subsequence_sum(i+1 , ans , k , arr , sum-ans[i]);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ArrayList<Integer> arr = new ArrayList<>();

        int[] ans = new int[n];

        for(int i=0  ; i<n ; i++){
            int a = sc.nextInt();
            arr.add(a);
        }

        System.out.println("Enter required sum : ");
        int k = sc.nextInt();

        subsequence_sum(0 , ans , k , arr , 0);

    }
}
