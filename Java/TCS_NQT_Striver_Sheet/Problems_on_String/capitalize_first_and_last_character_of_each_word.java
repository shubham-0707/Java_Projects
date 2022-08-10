/*
... Capitalize first and last character of each word...
 */


package TCS_NQT_Striver_Sheet.Problems_on_String;
import java.util.*;

public class capitalize_first_and_last_character_of_each_word {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String[] st = str.split(" ");

        for(int i=0 ; i<st.length ; i++){
            char ch = Character.toUpperCase(st[i].charAt(0));
            String x = st[i].substring(1 ,st[i].length()-1);
            char chr = Character.toUpperCase(st[i].charAt(st[i].length()-1));
            st[i] = ch+x+chr;
        }

        String ans = "";
        for(int i=0 ; i<st.length-1 ; i++){
            ans+=st[i]+" ";
        }
        ans+=st[st.length-1];
        System.out.println("The answer is : "+ans);

        // Time Complexity : O(N)
        // Space Complexity : O(N)

    }
}
