/*
...Find the ascii number of any character...
 */



package TCS_NQT_Striver_Sheet.Problems_on_String;
import java.util.*;

public class find_ascii_number_of_a_character {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);

        System.out.println("The ascii code of the charcter is : "+(int)ch);

        // Time Complexity : O(1)
        // Space Complexity : O(1)
    }
}
