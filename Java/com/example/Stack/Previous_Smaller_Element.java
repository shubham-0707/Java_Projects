package com.example.Stack;
import java.util.*;


// This program is made to get the previous smaller element in the array than the current element in the array...
// If no smaller element is found in the array then -1 is added to the ans array...
public class Previous_Smaller_Element {
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
                while (!st.isEmpty() && st.peek() >= arr[i]) {
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
