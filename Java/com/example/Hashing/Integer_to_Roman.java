package com.example.Hashing;
import java.util.*;

public class Integer_to_Roman {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        LinkedHashMap<Integer , String> hash = new LinkedHashMap<>();
        hash.put(1000, "M");
        hash.put(900 , "CM");
        hash.put(500 , "D");
        hash.put(400 , "CD");
        hash.put(100 , "C");
        hash.put(90 , "XC");
        hash.put(50 , "L");
        hash.put(40 , "XL");
        hash.put(10 , "X");
        hash.put(9 , "IX");
        hash.put(5 , "V");
        hash.put(4 ,"IV");
        hash.put(1 , "I");


        StringBuilder str = new StringBuilder();
        for(Map.Entry<Integer , String> i : hash.entrySet()){
            while(n>=i.getKey()){
                str=str.append(i.getValue());
                n=n-i.getKey();
            }
        }

        System.out.println(str.toString());
    }
}
