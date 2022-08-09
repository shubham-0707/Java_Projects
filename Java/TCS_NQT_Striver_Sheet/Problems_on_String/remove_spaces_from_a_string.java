/*
...Remove spaces from a string...
 */


package TCS_NQT_Striver_Sheet.Problems_on_String;
import java.util.*;

public class remove_spaces_from_a_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String ans = "";
        for(int i=0 ; i<str.length() ; i++){
            if(str.charAt(i)==' '){
                continue;
            }
            else{
                ans+=str.charAt(i);
            }
        }
        System.out.println("The answer is : "+ans);

        // Time Complexity : O(n)
        // Space Complexity : O(1)
    }
}
