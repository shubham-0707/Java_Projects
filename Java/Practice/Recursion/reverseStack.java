package Practice.Recursion;
import java.util.*;

// This program is made to print the stack elements in order in which they are pushed to the stack...
public class reverseStack {
    public static void reverse_Stack(Stack<Character> st , String ans){
        if(st.empty()){
            System.out.print(ans);
            return;
        }
        else{
            ans = st.pop() + ans;
            reverse_Stack(st , ans);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Character> st = new Stack<>();
        st.push('a');
        st.push('b');
        st.push('c');
        reverse_Stack(st , "");
    }
}
