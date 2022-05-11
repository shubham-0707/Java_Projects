package com.example.basic_programs;
import java.util.*;

public class pangram {
    public static void main(String[] args) {
        String str;
        Scanner sc = new Scanner(System.in);
        str = sc.nextLine();

        str= str.toUpperCase();

        int arr[] = new int[100];
        for(int i=0 ; i<str.length() ; i++){
            arr[(int)(str.charAt(i))]=arr[(int)(str.charAt(i))]+1;
        }

        boolean flag = true;
        for(int i=65 ; i<91 ; i++){
            if(arr[i]<1){
                flag = false;
                break;
            }
        }



        if(flag==true){
            System.out.println("pangram");
        }
        else{
            System.out.println("not pangram");
        }
    }
}
