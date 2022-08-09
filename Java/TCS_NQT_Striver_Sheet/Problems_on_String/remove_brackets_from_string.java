/*
... Remove brackets from string...
 */

package TCS_NQT_Striver_Sheet.Problems_on_String;
import java.util.*;

public class remove_brackets_from_string {
    public static boolean isBracket(char ch){
        if(ch=='('||ch=='{'||ch=='['||ch==']'||ch=='}'||ch==')'){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String ans = "";
        for(int i=0 ; i<str.length() ; i++){
            if(!isBracket(str.charAt(i))){
                ans+=str.charAt(i);
            }
        }
        System.out.println("The answer is : "+ans);

        // Time Complexity : O(N)
        // Space Complexity : O(1)
    }
}
