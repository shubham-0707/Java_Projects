/*

...Print all the duplicates from the string...

 */

package TCS_NQT_Striver_Sheet.Problems_on_String;
import java.util.*;

public class print_all_duplicates_from_the_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        HashMap<Character , Integer> hash = new HashMap<>();
        for(int i=0 ; i<str.length() ; i++){
            hash.put(str.charAt(i) , hash.getOrDefault(str.charAt(i) , 0)+1);
        }

        // printing the duplicates from the string...
        for(char ch : hash.keySet()){
            if(hash.get(ch)>=2){
                System.out.println(ch+" ");
            }
        }

        // Time Complexity : O(N)
        // Space Complexity : O(N)
    }
}
