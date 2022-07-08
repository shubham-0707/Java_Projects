package com.example.Stack;
import java.util.*;

// This program is made to get the previous greater element than the current element of the array...
public class Previous_Greater_Element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }

        Stack<Integer> st = new Stack<>();

        ArrayList<Integer> ans = new ArrayList<>();

        for(int i=0 ; i<n ; i++){
            if(st.isEmpty()){
                st.push(arr[i]);
                ans.add(-1);
            }
            else {
                while (!st.isEmpty() && st.peek() <= arr[i]) {
                    st.pop();
                }

                if (st.isEmpty()) {
                    ans.add(-1);
                } else {
                    ans.add(st.peek());
                }
                st.push(arr[i]);
            }
        }

        for(int i=0 ; i<ans.size() ; i++){
            System.out.print(ans.get(i)+" ");
        }
    }
}
