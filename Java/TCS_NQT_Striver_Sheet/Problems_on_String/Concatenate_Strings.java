/*
...Concatenate one string to another...
 */

package TCS_NQT_Striver_Sheet.Problems_on_String;
import java.util.*;

public class Concatenate_Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st string : ");
        String str1 = sc.nextLine();
        System.out.print("Enter 2nd string : ");
        String str2 = sc.nextLine();

        String ans = str1+str2;
        System.out.println("The concatenated string is : "+ans);

        // Time Complexity : O(1)
        // Space Complexity : O(1)
    }
}
