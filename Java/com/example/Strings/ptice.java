package com.example.Strings;
import java.util.*;

public class ptice {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.nextLine();

        char[] arr = str.toCharArray();

        System.out.println();
        String ad = "ABC";
        String br = "BABC";
        String go = "CCAABB";





        char[] ad_arr = new char[n];
        char[] br_arr = new char[n];
        char[] go_arr = new char[n];

        int k=0;
        for(int i=0 ; i<n ; i++){
            ad_arr[i] = ad.charAt(k);
            k++;
            k=k%3;

        }



        k=0;
        for(int i=0 ; i<n ; i++){
            br_arr[i] = br.charAt(k);
            k++;
            k=k%4;


        }



        k=0;
        for(int i=0 ; i<n ; i++){
            go_arr[i] = go.charAt(k);
            k++;
            k=k%6;

        }


        int ad_count = 0;
        int br_count = 0;
        int go_count = 0;

        for(int i=0 ; i<n ; i++){
            if(arr[i]==ad_arr[i]){

                ad_count++;
            }
        }

        for(int i=0 ; i<n ; i++){
            if(arr[i]==br_arr[i]){
                br_count++;
            }
        }

        for(int i=0 ; i<n ; i++){
            if(arr[i]==go_arr[i]){

                go_count++;
            }
        }

        int maxi = Math.max(ad_count , Math.max(br_count , go_count));

        System.out.println(maxi);
        if(maxi==ad_count){
            System.out.println("Adrian");
        }
        if(maxi==br_count){
            System.out.println("Bruno");
        }
        if(maxi==go_count){
            System.out.println("Goran");
        }

    }
}
