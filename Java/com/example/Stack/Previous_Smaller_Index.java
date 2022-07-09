package com.example.Stack;
import java.util.*;


// This program is made to get the index of the previous smaller element than the current element in the array...
// If no smaller element is found then -1 is added to the ans array for that element...
public class Previous_Smaller_Index {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }

        Stack<Integer> st = new Stack<>();
        Stack<Integer> idx = new Stack<>();
        ArrayList<Integer> ans = new ArrayList<>();

        for(int i=0 ; i<n ; i++){
            if(st.isEmpty()){
                st.push(arr[i]);
                ans.add(-1);
                idx.push(i);
            }
            else{
                while(!st.isEmpty() && !idx.isEmpty() && st.peek()>=arr[i]){
                    st.pop();
                    idx.pop();
                }

                if(st.isEmpty() && idx.isEmpty()){
                    ans.add(-1);
                }
                else{
                    ans.add(idx.peek());
                }

                st.push(arr[i]);
                idx.push(i);
            }
        }

        for(int i=0 ; i<ans.size() ; i++){
            System.out.print(ans.get(i)+" ");
        }
    }
}
