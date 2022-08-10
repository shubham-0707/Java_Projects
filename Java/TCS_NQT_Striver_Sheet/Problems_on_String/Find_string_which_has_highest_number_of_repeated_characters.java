/*
...Find the word in the string which has the highest number of repeated letters...
 */


package TCS_NQT_Striver_Sheet.Problems_on_String;
import java.util.*;

public class Find_string_which_has_highest_number_of_repeated_characters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         String str = sc.nextLine();


         str=str.toLowerCase();
         str = str.replaceAll("\\s+" , " ").trim();
         String[] st = str.split(" ");

         HashMap<String , Integer> hash = new HashMap<>();
         for(int i=0 ; i<st.length ; i++){
             String temp = st[i];
             int count = 0;
             HashMap<Character , Integer> hash2 = new HashMap<>();
             for(int j=0 ; j<st[i].length() ; j++){
                 hash2.put(st[i].charAt(j) , hash2.getOrDefault(st[i].charAt(j) , 0)+1);
             }

             for(char ch : hash2.keySet()){
                 if(hash2.get(ch)>=2){
                     count++;
                 }
             }

             hash.put(st[i] , count);
         }

         int maxi = 0;
         String ans = "";
         for(String str1 : hash.keySet()){
             if(hash.get(str1)>maxi){
                 maxi = hash.get(str1);
                 ans = str1;
             }
         }

        System.out.println("Word with maximum duplicates is : "+ans);

         // Time Complexity : O(n^2)
        // Space Complexity : O(N)

    }
}
