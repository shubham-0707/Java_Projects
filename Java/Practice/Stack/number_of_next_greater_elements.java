package Practice.Stack;
import java.util.*;

public class number_of_next_greater_elements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }

        Stack<Integer> st =  new Stack<>();
        Stack<Integer> ans = new Stack<>();

        for(int i=arr.length-1 ; i>=0 ; i--){
            if(st.isEmpty()){
                ans.push(0);
            }
            else{
                while(!st.isEmpty() && st.peek()<=arr[i]){
                    st.pop();
                }

                if(st.isEmpty()){
                    ans.push(0);
                }
                else{
                    ans.push(st.size());
                }
            }
            st.push(arr[i]);
        }

        while(!ans.isEmpty()){
            System.out.print(ans.pop() + " ");
        }

    }
}
