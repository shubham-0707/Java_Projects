package com.example.basic_programs;
import java.util.*;

public class isPalindrome_3rd_approach {

    public static boolean isPalindrome(int n){
        int ans = 0;
        int prev = n;
        while(n>0){
            int res = n%10;
            ans = ans*10+res;
            n=n/10;
        }

        return ans==prev;
    }

    public static void main(String[] args) {
        int n;
        System.out.println("Enter the number : ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        System.out.println(isPalindrome(n));
    }
}
