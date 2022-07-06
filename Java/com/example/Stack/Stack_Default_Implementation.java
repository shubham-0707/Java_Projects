package com.example.Stack;
import java.util.*;

// This is the program which is made to understand the working of default class of Stack in java...
public class Stack_Default_Implementation {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(5);
        s.push(10);
        s.push(15);
        s.push(20);
        s.push(30);

        while(!s.isEmpty()){
            System.out.println(s.pop());
        }

        s.push(40);
        System.out.println("Size of stack : "+s.size());
        System.out.println("Top Element is : "+s.peek());
    }
}
