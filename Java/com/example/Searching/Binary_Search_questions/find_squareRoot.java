package com.example.Searching.Binary_Search_questions;
import java.util.*;


// Program to find the square root of any number using binary search...
public class find_squareRoot {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter n : ");
        int n = sc.nextInt();

        int start = 1;
        int end = n-1;
        int mid = start + (end-start)/2;
        while(start<=end){
            if(mid*mid==n){
                mid=mid+1;
                break;
            }
            else if(mid*mid <n){
                start=mid+1;
            }
            else{
                end=mid-1;
            }

            mid= start + (end-start)/2;
        }

        System.out.println("The square root of the number is : "+(mid-1));


    }
}
