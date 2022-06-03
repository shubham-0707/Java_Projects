package com.example.Strings;
import java.util.*;


//Program to reverse a string....
public class reverse_a_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();


        char[] charArray = str.toCharArray();
        int i=0;
        int j=charArray.length-1;
        while(i<=j){
            char temp = charArray[i];
            charArray[i] = charArray[j];
            charArray[j] = temp;

            i++;
            j--;
        }

        String ans="";
        for(int k=0 ; k<charArray.length ; k++){
            ans += ""+charArray[k];
        }

        System.out.println("The reversed String is : "+ans);
    }
}
