package com.example.Recursion;
import java.util.*;


// This program is made to get the sum upto n numbers using parametrized recursion...
public class sum_of_n_numbers_parametrized {

    public static int sum(int n , int sum){
        if(n<1){
            return sum;
        }
        return sum(n-1 , sum+n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println(sum(n  , 0));
    }
}
