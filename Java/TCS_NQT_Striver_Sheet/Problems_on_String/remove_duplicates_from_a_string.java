/*

...remove duplicates from a string...

 */


package TCS_NQT_Striver_Sheet.Problems_on_String;
import java.util.*;

public class remove_duplicates_from_a_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        LinkedHashMap<Character , Integer> hash = new LinkedHashMap<>();
        for(int i=0 ; i<str.length() ; i++){
            hash.put(str.charAt(i) , hash.getOrDefault(str.charAt(i) , 0)+1);
        }
        String ans = "";
        for(char ch : hash.keySet()){
            ans+=ch;
        }
        System.out.println("The string is : "+ans);

        // Time Complexity : O(N)
        // Space Complexity : O(N)
    }
}
