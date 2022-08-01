package Practice.Stack;
import java.util.*;


// This program is made to get the next smaller element in an array of an array element...
public class next_smaller_element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i=0 ; i<n ; i++){
            arr[i]= sc.nextInt();
        }

        Stack<Integer> st = new Stack<>();
        Stack<Integer> ans = new Stack<>();

        for(int i=n-1 ; i>=0 ; i--){
            if(st.isEmpty()){
                st.push(arr[i]);
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

                st.push(arr[i]);
            }
        }


        while(!ans.isEmpty()){
            System.out.print(ans.pop()+" ");
        }

    }
}
