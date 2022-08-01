package Practice.Stack;
import java.util.*;


// This program is made to find out the next greater element in the right of the element in the array...
public class Next_Greater_Element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }

        Stack<Integer> st = new Stack<>();
        Stack<Integer> ans = new Stack<>();
        for(int i=n-1 ; i>=0 ; i++){
            if(st.isEmpty()){
                st.push(arr[i]);
                ans.push(-1);
            }
            else{
                while(!st.isEmpty() && st.peek()<=arr[i]){
                    st.pop();
                }
                if(!st.isEmpty()){
                    ans.push(st.peek());
                }
                else {
                    ans.push(-1);
                }
                st.push(arr[i]);
            }
        }


        while(!ans.isEmpty()){
            System.out.print(ans.pop()+" ");
        }
    }
}
