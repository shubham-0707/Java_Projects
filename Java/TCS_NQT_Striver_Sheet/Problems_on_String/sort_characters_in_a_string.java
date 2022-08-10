/*
...Sort characters in a string...
 */

package TCS_NQT_Striver_Sheet.Problems_on_String;
import java.util.*;

public class sort_characters_in_a_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str=str.toLowerCase();

        char[] st = str.toCharArray();
        Arrays.sort(st);
        str = String.valueOf(st);

        System.out.println("The sorted string is : "+str);

        // Time Complexity : O(n*logn)
        // Space Complexity : O(N)
    }
}
