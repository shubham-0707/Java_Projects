package Practice.Hashing;
import java.util.*;

public class character_in_a_string {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

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

        System.out.println(ans);

        // Time Complexity : O(N)
        // Space Complexity : O(N)

    }

}
