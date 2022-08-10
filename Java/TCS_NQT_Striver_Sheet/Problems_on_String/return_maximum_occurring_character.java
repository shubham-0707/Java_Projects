/*
...Return maximum occurring character in the string...
 */

package TCS_NQT_Striver_Sheet.Problems_on_String;
import java.util.*;

public class return_maximum_occurring_character {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        HashMap<Character , Integer> hash = new HashMap<>();
        for(int i=0 ; i<str.length() ; i++){
            hash.put(str.charAt(i) , hash.getOrDefault(str.charAt(i) , 0)+1);
        }

        int maxi = Integer.MIN_VALUE;
        char ans = ' ';
        for(char ch:hash.keySet()){
            if(hash.get(ch)>maxi){
                ans = ch;
                maxi = hash.get(ch);
            }
        }
        System.out.println("The maximum occurring character is : "+ans);

        // Time Complexity : O(N)
        // Space Complexity : O(N)
    }
}
