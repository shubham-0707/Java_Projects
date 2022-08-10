/*

...Find the non repeating characters of a string...

 */

package TCS_NQT_Striver_Sheet.Problems_on_String;
import java.util.*;

public class find_non_repeating_characters_of_a_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        /*
        Approach : we will use a hashmap to store the frequency of each character of the string...

         */

        HashMap<Character , Integer> hash = new HashMap<>();
        for(int i=0 ; i<str.length() ; i++){
            hash.put(str.charAt(i) , hash.getOrDefault(str.charAt(i) , 0)+1);
        }

        // printing the characters who have just a frequency of 1...
        System.out.println("Non repeating characters are : ");
        for(char ch : hash.keySet()){
            if(hash.get(ch)==1){
                System.out.println(ch+" ");
            }
        }

        // Time Complexity : O(N)
        // Space Complexity : O(N)
    }
}
