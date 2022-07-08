package com.example.Stack;
import java.util.*;


// This is the program to get the next greater element index of every element of the array....if there is no next..
// greater element then the next index to the last index is the answer....
public class Next_greater_index {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }

        Stack<Integer> st = new Stack<>();
        Stack<Integer> ans = new Stack<>();
        Stack<Integer> idx = new Stack<>();
        for(int i=n-1 ; i>=0 ; i--){
            if(st.isEmpty() && idx.isEmpty()){
                st.push(arr[i]);
                idx.push(i);
                ans.push(n);
            }

            else{
                while(!st.isEmpty() && !idx.isEmpty() && st.peek()<=arr[i]){
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
