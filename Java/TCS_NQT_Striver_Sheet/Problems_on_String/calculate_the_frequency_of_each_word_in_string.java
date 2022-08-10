/*
...Calculate the frequency of each character in a string...
 */

package TCS_NQT_Striver_Sheet.Problems_on_String;
import java.util.*;

public class calculate_the_frequency_of_each_word_in_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        /*
        Approach : We are going to use a hashmap to store the frequency of each character in the map..

         Time Complexity : O(N)
         Space Complexity : O(N)

         */

        HashMap<Character , Integer> hash = new HashMap<>();
        for(int i=0 ; i<str.length() ; i++){
            hash.put(str.charAt(i) , hash.getOrDefault(str.charAt(i) , 0)+1);
        }

        // Printing the character along with the frequency of that character...

        for(char ch : hash.keySet()){
            System.out.println(ch+" "+hash.get(ch));
        }

    }
}
