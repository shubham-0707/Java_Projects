package Big_Oh_Assignment;
import java.util.*;

public class infix_to_postfix {

    public static String infixToPostfix(String str , Stack<Character> st , String infix){
        HashMap<Character , Integer> hash = new HashMap<>();
        hash.put('(' , 0);
        hash.put(')' , 0);
        hash.put('+' , 1);
        hash.put('-' , 1);
        hash.put('*' , 2);
        hash.put('/' , 2);
        hash.put('^' , 3);

        for(int i=0 ; i<infix.length() ; i++){
            if(st.isEmpty() || infix.charAt(i)=='('){
                st.push(infix.charAt(i));
            }
            else if(hash.get(infix.charAt(i))==null){
                str+=infix.charAt(i);
            }
            else if(infix.charAt(i)==')'){
                while(st.peek()!='('){
                    str+=st.pop();
                }
                st.pop();
            }
            else{
                if(hash.get(infix.charAt(i))>hash.get(st.peek())){
                    st.push(infix.charAt(i));
                }
                else if(hash.get(infix.charAt(i))<hash.get(st.peek())){
                    while(!st.isEmpty() && hash.get(st.peek())>=hash.get(infix.charAt(i))){
                        str+=st.pop();
                    }
                    st.push(infix.charAt(i));
                }
            }
        }

        while(!st.isEmpty()){
            str+=st.pop();
        }

        return str;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        Stack<Character> st = new Stack<>();
        String ans = infixToPostfix("" , st , str);
        System.out.println("The postfix of the given infix expression is : "+ans);
    }
}
