package com.example.Strings;
import java.util.*;


// Program to reverse an array and remove extra spaces...
public class reverse_words_of_a_string {
    public static void main(String[] args) {
        String s = "a good   example";

        String[] str = s.split(" ");

        String ans = "";
        for(int i=str.length-1 ; i>=0 ; i--){
            if(str[i].isEmpty()==false){
                ans = ans + str[i] + " ";
            }
        }


        System.out.println("The reversed array with removed extra spaces is : ");

        System.out.println(ans);

    }
}
