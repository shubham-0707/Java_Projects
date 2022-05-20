package com.example.Strings;
import java.util.*;

public class test_string {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();

        char[] arr = new char[n];
        for(int i=0 ; i<n ; i++){
            char ch = sc.next().charAt(0);
            arr[i] = ch;
        }



        int[] count = new int[125];
        for(int i=0 ; i<125 ; i++){
            count[arr[i]-0]++;
        }

        char ans=' ';
        for(int i=0 ; i<125 ; i++){
            if(count[i]%2!=0){
                ans = (char)i;
                break;
            }
        }
        System.out.println(ans);
    }
}
