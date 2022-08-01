package Practice.Recursion;
import java.util.*;

// This program is just made to check that a string is a palindrome or not...
public class palindrome_in_a_string {
    public static String checkPalindrome(String str){

        if(str.length()==0){
            return "";
        }
        return str.charAt(str.length()-1) + checkPalindrome(str.substring(0 , str.length()-1));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(str.equals(checkPalindrome(str)));
    }
}
