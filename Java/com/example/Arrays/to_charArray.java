package com.example.Arrays;
import java.util.*;

public class to_charArray {
    public static void main(String[] args) {
        String s;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your string : ");
        s = sc.nextLine();
        char[] ch = s.toCharArray();

        for(char i : ch){
            System.out.print(i+" ");
        }
    }
}
