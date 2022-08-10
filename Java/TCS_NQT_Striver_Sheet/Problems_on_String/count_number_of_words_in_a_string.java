/*
...Count number of words in a string...
 */

package TCS_NQT_Striver_Sheet.Problems_on_String;
import java.util.*;

public class count_number_of_words_in_a_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        // this line is very important..
        str = str.replaceAll("\\s+"," ").trim();

        String[] st = str.split(" ");
        System.out.println("The number of words in the string is : "+st.length);

        // Time Complexity : O(N)
        // Space Complexity : O(N)
    }
}
