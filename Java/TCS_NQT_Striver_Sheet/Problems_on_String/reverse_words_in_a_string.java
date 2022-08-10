/*
...reverse words in a string...
 */

package TCS_NQT_Striver_Sheet.Problems_on_String;
import java.util.*;

public class reverse_words_in_a_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        str = str.replaceAll("\\s+", " ").trim();

        String[] st = str.split(" ");

        int start = 0;
        int end = st.length-1;

        while(start<end){
            String temp = st[start];
            st[start] = st[end];
            st[end] = temp;
            start++;
            end--;
        }

        String ans = "";
        for(int i=0 ; i<st.length-1 ; i++){
            ans = ans + st[i] + " ";
        }
        ans = ans + st[st.length-1];

        System.out.println("The resultant string is : "+ans);

        // Time Complexity : O(N)
        // Space Complexity : O(N)

    }
}
