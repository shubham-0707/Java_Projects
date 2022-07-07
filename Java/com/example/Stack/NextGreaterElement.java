package com.example.Stack;
import java.util.*;

// Next Greater Element second program contributed by someone else....
public class NextGreaterElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }

        int[] ret = new int[n];
        Stack<Integer> st = new Stack<Integer>();
        ret[n-1] = -1;
        st.push(arr[n-1]);
        for(int i=n-2;i>=0;i--)
        {
            while(!st.empty() && st.peek()<=arr[i]) st.pop();
            {
                if(st.empty())
                {
                    ret[i] = -1;
                    st.push(arr[i]);
                }
                else
                {
                    ret[i] = st.peek();
                    st.push(arr[i]);
                }
            }
        }
        for(int i=0 ; i<ret.length ; i++){
            System.out.print(ret[i]+" ");
        }

    }
}
