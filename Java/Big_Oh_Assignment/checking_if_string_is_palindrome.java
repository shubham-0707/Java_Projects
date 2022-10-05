package Big_Oh_Assignment;
import java.util.*;

public class checking_if_string_is_palindrome {

    public static boolean isPalindrome(String str , int start , int end){

        if(start<end){
            if(str.charAt(start)!=str.charAt(end)){
                return false;
            }
            start++;
            end--;
            isPalindrome(str , start , end);
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        System.out.println(isPalindrome(str , 0 , str.length()-1));

    }
}
