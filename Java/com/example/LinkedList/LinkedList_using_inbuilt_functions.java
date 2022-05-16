package com.example.LinkedList;
import java.util.*;


// Program to implement LinkedList using utilities of the JAVA...
public class LinkedList_using_inbuilt_functions {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.addFirst("Aman");
        list.add("are");
        list.addFirst("and");
        list.addFirst("Shubham");
        list.addLast("good boys");

        System.out.println(list);

        list.remove();
        System.out.println(list);


        list.removeFirst();
        System.out.println(list);

        for(String i : list){
            System.out.print(i + "->");
        }
        System.out.print("NULL");
    }
}
