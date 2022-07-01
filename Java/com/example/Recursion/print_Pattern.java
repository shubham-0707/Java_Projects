package com.example.Recursion;
import java.util.*;

public class print_Pattern {

    public static void printPattern(int n , int m , int flag){
        if(n==m){
            //System.out.print(n+" ");
            return;
        }
        else if(n>0 && flag==0){
            if((n-5)<=0) flag=1;
            System.out.print((n-5)+" ");
            printPattern((n-5) , m , flag);

        }
        else{
            System.out.print((n+5)+" ");
            printPattern((n+5) , m , flag);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = n;
        int flag = 0;
        System.out.print(n+" ");
        System.out.print(n-5+" ");
        printPattern(n-5 , m , flag);
    }
}
