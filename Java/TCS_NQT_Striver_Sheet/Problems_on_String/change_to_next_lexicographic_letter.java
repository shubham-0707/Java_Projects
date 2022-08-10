/*
...Change to next lexicographic letter in a string...
 */

package TCS_NQT_Striver_Sheet.Problems_on_String;
import java.util.*;

public class change_to_next_lexicographic_letter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String ans = "";
        for(int i=0 ; i<str.length() ; i++){
            char ch = (char)((int)str.charAt(i)+1);
            ans+=ch;
        }

        System.out.println("The answer is : "+ans);

        // Time Complexity : O(N)
        // Space Complexity : O(1)
    }
}
