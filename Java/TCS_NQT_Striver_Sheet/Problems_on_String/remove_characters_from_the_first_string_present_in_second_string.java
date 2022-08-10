/*

...Remove characters from the first string present in the second string...

 */


package TCS_NQT_Striver_Sheet.Problems_on_String;
import java.util.*;

public class remove_characters_from_the_first_string_present_in_second_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();


        // storing the characters of string 2 in  a hashmap...
        HashMap<Character , Integer> hash = new HashMap<>();
        for(int i=0 ; i<str2.length() ; i++){
            hash.put(str2.charAt(i) , hash.getOrDefault(str2.charAt(i) , 0)+1);
        }
        String ans = "";
        for(int i=0 ; i<str1.length() ; i++){
            if(!hash.containsKey(str1.charAt(i))){
                ans+=str1.charAt(i);
            }
        }

        System.out.println("The string generated is : "+ans);

        // Time Complexity : O(N)
        // Space Complexity : O(N)
    }
}
