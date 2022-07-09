package com.example.Stack;
import java.util.*;


// This program is made to get the index of the next smaller element than the current element in the array..
// If no smaller element is found in the array...n+1 is considered as the next smaller element index...
public class next_smaller_index {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }

        Stack<Integer> st = new Stack<>();
        Stack<Integer> ans = new Stack<>();
        Stack<Integer> idx =  new Stack<>();

        for(int i=n-1 ; i>=0 ; i--){
            if(st.isEmpty() && idx.isEmpty()){
                st.push(arr[i]);
                ans.push(n);
                idx.push(i);
            }
            else{
                while(!st.isEmpty() && !idx.isEmpty() && st.peek()>=arr[i]){
                    st.pop();
                    idx.pop();
                }

                if(st.isEmpty() && idx.isEmpty()){
                    ans.push(n);
                }
                else{
                    ans.push(idx.peek());
                }
                st.push(arr[i]);
                idx.push(i);
            }
        }

        while(!ans.isEmpty()){
            System.out.print(ans.pop()+" ");
        }

    }
}
