package com.example.Recursion;
import java.util.*;


// In this problem we have to calculate the 'a' raise to power 'b' using recursion....
public class compute_power {
    public static int calcPower(int a , int b){
        if(b==0){
            return 1;
        }
        return a*calcPower(a , b-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a , b;
        System.out.println("Enter a : ");
        a = sc.nextInt();
        System.out.println("Enter b : ");
        b = sc.nextInt();

        System.out.println("a raised to power b is : "+calcPower(a , b));
    }
}
