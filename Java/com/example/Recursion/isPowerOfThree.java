package com.example.Recursion;
import java.util.*;


// This program is made to check that a number is a power Of three or not...
public class isPowerOfThree {
    public static boolean isPowerOf3(int n) {

        if (n / 3 == 0) {
            return false;
        } else if (n == 3) {
            return true;
        }
        else if(n%3!=0){
            return false;
        }
        return isPowerOf3(n / 3);
    }
    public static void main(String[] args) {
        int n ;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        n = sc.nextInt();

        boolean flag = isPowerOf3(n);
        System.out.println(flag);
    }
}
