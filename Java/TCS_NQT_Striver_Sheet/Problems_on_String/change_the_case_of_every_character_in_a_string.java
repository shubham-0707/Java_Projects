/*

...Change the case of every character in a string...

 */


package TCS_NQT_Striver_Sheet.Problems_on_String;
import java.util.*;

public class change_the_case_of_every_character_in_a_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String ans = "";
        for(int i=0 ; i<str.length() ; i++){
            if((int)str.charAt(i)>=65 && (int)str.charAt(i)<=90){
                ans = ans + Character.toLowerCase(str.charAt(i));
            }
            else{
                ans = ans + Character.toUpperCase(str.charAt(i));
            }
        }

        System.out.println("The answer is : "+ans);

        // Time Complexity : O(N)
        // Space Complexity : O(1)
    }
}
