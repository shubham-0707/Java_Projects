package com.example.Stack;
import java.util.*;


// This program is made to get the index of the previous greater element index than the current element in the array...
// If no greater element is found then -1 is supposed to be the position of previous greater element...
public class previous_greater_index {

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
                while(!st.isEmpty() && !idx.isEmpty() && st.peek()<=arr[i]){
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
