package com.example.basic_programs;
import java.util.*;

public class sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a , b , add;
        System.out.println("Enter a : ");
        a = sc.nextInt();
        System.out.println("Enter b : ");
        b = sc.nextInt();

        add = a+b;
        System.out.println("The sum is : "+add);
    }

}
