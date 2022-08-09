/*

.... Reverse a string...

 */

package TCS_NQT_Striver_Sheet.Problems_on_String;
import java.util.*;

public class reverse_a_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        char[] ch = str.toCharArray();

        int start = 0;
        int end = ch.length-1;

        while(start<end){
            char temp = ch[start];
            ch[start] = ch[end];
            ch[end] = temp;
            start++;
            end--;
        }


        str = String.valueOf(ch);
        System.out.println("The reversed string is : "+str);

        // Time Complexity : O(N)
        // Space Complexity : O(N)
    }
}
