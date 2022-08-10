/*

...Check that two strings are anagrams of each other or not...

 */

package TCS_NQT_Striver_Sheet.Problems_on_String;
import java.util.*;

public class check_for_anagram_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        /*
        Approach : In this we are going to store the frequency of all the characters in two hashmaps..

        Time Complexity : O(N)
        Space Complexity : O(N)

         */

        HashMap<Character , Integer> hash1 = new HashMap<>();
        HashMap<Character , Integer> hash2 = new HashMap<>();

        // storing the first string characters to hash1...
        for(int i=0 ; i<str1.length() ; i++){
            hash1.put(str1.charAt(i) , hash1.getOrDefault(str1.charAt(i) , 0)+1);
        }

        // storing thr second string characters to hash2...
        for(int i=0 ; i<str2.length() ; i++){
            hash2.put(str2.charAt(i) , hash2.getOrDefault(str2.charAt(i) , 0)+1);
        }

        if(hash1.size()!=hash2.size()){
            System.out.println("The strings are not anagrams");
            return;
        }

        else{
            Object[] chr1 = hash1.keySet().toArray();
            Object[] chr2 = hash2.keySet().toArray();

            for(int i=0 ; i<chr1.length ; i++) {
                if (chr1[i] != chr2[i] || hash1.get(chr1[i]) != hash2.get(chr2[i])) {
                    System.out.println("The strings are not Anagrams..");
                    return;
                }
            }
        }

        System.out.println("The Strings are anagrams..");


    }
}
