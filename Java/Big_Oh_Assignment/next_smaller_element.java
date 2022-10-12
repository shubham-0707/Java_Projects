package Big_Oh_Assignment;
import java.util.*;

public class next_smaller_element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }

        Stack<Integer> st = new Stack<>();
        Stack<Integer> ans = new Stack<>();

        for(int i=arr.length-1 ; i>=0 ; i--){
            if(st.isEmpty()){
                ans.push(-1);
            }
            else{
                while(!st.isEmpty() && st.peek()>=arr[i]){
                    st.pop();
                }
                if(st.isEmpty()){
                    ans.push(-1);
                }
                else{
                    ans.push(st.peek());
                }
            }
            st.push(arr[i]);
        }

        System.out.println("The answer is : ");
        while(!ans.isEmpty()){
            System.out.print(ans.pop()+" ");
        }

    }
}
