/*
...Find largest word in a string...

 */


package TCS_NQT_Striver_Sheet.Problems_on_String;
import java.util.*;

public class find_largest_word_in_a_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String[] st = str.split(" ");
        int maxi = 0;
        String ans = "";
        for(int i=0 ; i<st.length ; i++){
            if(st[i].length()>maxi){
                maxi = st[i].length();
                ans = st[i];
            }
        }
        System.out.println("The largest word is : "+ans);

        // Time Complexity : O(N)
        // Space Complexity : O(N)
    }
}
