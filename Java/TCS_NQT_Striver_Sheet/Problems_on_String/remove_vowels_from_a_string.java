/*
...Remove vowels from a string or line...
 */

package TCS_NQT_Striver_Sheet.Problems_on_String;
import java.util.*;

public class remove_vowels_from_a_string {

    private static boolean isVowel(char ch){
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String ans = "";
        for(int i=0 ; i<str.length(); i++){
            if(isVowel(str.charAt(i))){
                continue;
            }
            else{
                ans+=str.charAt(i);
            }
        }
        System.out.println("The answer is : "+ans);

        // Time Complexity : O(N)
        // Space Complexity : O(1)
    }
}
