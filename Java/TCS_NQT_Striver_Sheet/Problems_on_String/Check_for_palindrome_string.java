/*

In this question we have to check that a string is palindrome...

 */


package TCS_NQT_Striver_Sheet.Problems_on_String;
import java.util.*;

public class Check_for_palindrome_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string : ");
        String str = sc.next();

        /*
        Approach 1 : Put all the characters in a stack and check by removing one character each time..

        Time Complexity : O(n)
        Space Complexity : O(n)

         */

        /*
        Approach 2 : USE Two Pointer Approach :

        Time Complexity : O(n)
        Space Complexity : O(1)

         */

        // Here we are going to use 2nd approach :

        int start = 0;
        int end = str.length()-1;

        while(start<end){
            if(str.charAt(start)!=str.charAt(end)){
                System.out.println("The string is not palindrome");
                return;
            }
            start++;
            end--;
        }
        System.out.println("The string is palindrome");

    }
}
