/*
... Remove all characters other than alphabets from a string...
 */

package TCS_NQT_Striver_Sheet.Problems_on_String;
import java.util.*;

public class remove_characters_other_than_alphabets_from_string {

    public static boolean isAlphabet(char ch){
        if ((int) ch >= 65 && (int) ch <= 90 || (int) ch >= 97 && (int)ch<=122) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String ans = "";
        for(int i=0 ; i<str.length() ; i++){
            if(isAlphabet(str.charAt(i))){
                ans+=str.charAt(i);
            }
        }
        System.out.println("The newly formed string is : "+ans);

        // Time Complexity : O(N)
        // Space Complexity : O(1)
    }
}
