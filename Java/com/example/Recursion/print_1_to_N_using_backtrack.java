package com.example.Recursion;
import java.util.*;


// This program is made to print the numbers from 1 to N using backtracking..
public class print_1_to_N_using_backtrack {

    public static void print(int n ){
        if(n<1){
            return;
        }
        print(n-1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        print(n);
    }
}
