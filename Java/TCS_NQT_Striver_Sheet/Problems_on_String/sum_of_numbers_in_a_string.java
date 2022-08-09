/*
...Sum of numbers in a string...
 */

package TCS_NQT_Striver_Sheet.Problems_on_String;
import java.util.*;

public class sum_of_numbers_in_a_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int sum = 0;
        for(int i=0 ; i<str.length() ; i++){
            if((int)str.charAt(i)>=48 && (int)str.charAt(i)<=57){
                sum+=Character.getNumericValue(str.charAt(i));
            }
        }
        System.out.println("The sum of the digits are : "+sum);

        // Time Complexity : O(N)
        // Space Complexity : O(1)
    }
}
