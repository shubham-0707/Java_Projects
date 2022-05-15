package com.example.Recursion;
import java.util.*;


// Program to count occurrences of "hi" in the string...
public class count_hi {
    public static int countHi(String str) {
        if(str.length()<2){
            return 0;
        }
        else if(str.substring(0 , 2).equals("hi")){
            return 1+countHi(str.substring(2));
        }
        return countHi(str.substring(1));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String : ");
        String str = sc.nextLine();

        int count = countHi(str);
        System.out.println("The number of hi are : "+count);

    }
}
