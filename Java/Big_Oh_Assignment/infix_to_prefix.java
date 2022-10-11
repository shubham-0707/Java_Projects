package Big_Oh_Assignment;
import java.util.*;

/*
Actually the main algorithm of conversion from infix to prefix is...

Reverse the infix expression..
change '(' to ')' and ')' to '('..
calculate its postfix...
then reverse the postfix...
that will be the prefix required at beginning...
 */

public class infix_to_prefix {

    public static void reverseCharArray(char[] arr){
        int start = 0;
        int end = arr.length-1;

        while(start<end) {
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void changeBrackets(char[] arr){
        for(int i=0 ; i<arr.length ; i++){
            if(arr[i]=='('){
                arr[i] = ')';
            }
            else if(arr[i]==')'){
                arr[i] = '(';
            }
        }
    }

    public static String toPostfix(String ans , String str , Stack<Character> st){
        HashMap<Character , Integer> hash = new HashMap<>();
        hash.put('+' , 1);
        hash.put('-' , 1);
        hash.put('*' , 2);
        hash.put('/' , 2);
        hash.put('^' , 3);
        hash.put('(' , 0);
        hash.put(')' , 0);

        for(int i=0 ; i<str.length() ; i++){
            if(st.isEmpty() || str.charAt(i)=='('){
                st.push(str.charAt(i));
            }
            else if(hash.get(str.charAt(i))==null){
                ans+=str.charAt(i);
            }
            else if(str.charAt(i)==')'){
                while(st.peek()!='('){
                    ans+=st.pop();
                }
                st.pop();
            }
            else{
                if(hash.get(str.charAt(i))>hash.get(st.peek())){
                    st.push(str.charAt(i));
                }
                else if(hash.get(str.charAt(i))<hash.get(st.peek())){
                    while(hash.get(st.peek())>=hash.get(str.charAt(i))){
                        ans+=st.pop();
                    }
                    st.push(str.charAt(i));
                }
            }
        }

        while(!st.isEmpty()){
            ans+=st.pop();
        }

        return ans;
    }
    public static String infixToPrefix(String ans ,String str , Stack<Character> st){
        char[] ch = str.toCharArray();
        reverseCharArray(ch);
        changeBrackets(ch);

        str= new String(ch);
        str = toPostfix("" , str , st);

        ch = str.toCharArray();
        reverseCharArray(ch);
        str = new String(ch);

        return str;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        Stack<Character> st = new Stack<>();
        String ans = infixToPrefix("" , str , st);

        System.out.println("The infix to prefix expression is : "+ans);

    }
}
