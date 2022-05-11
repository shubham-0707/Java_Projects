package com.example.Strings;
import java.util.*;

public class ToBinaryString {
    // This is a program to convert the integer to its corresponding binary string...

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input your number  :  ");
        n = sc.nextInt();

        System.out.println("The Binary String is : ");
        System.out.println(Integer.toBinaryString(n));
    }
}
