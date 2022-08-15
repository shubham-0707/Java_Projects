/*

...Convert octal to decimal...

 */


package TCS_NQT_Striver_Sheet.Problems_on_Number_System;
import java.util.*;

public class convert_octal_to_decimal {

    public static int toDecimal(String str){
        int sum = 0;
        int x = 0;

        for(int i=str.length()-1 ; i>=0 ; i--){
            sum = sum + Character.getNumericValue(str.charAt(i))*(int)Math.pow(8 , x);
            x++;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the octal number : ");
        System.out.println("The number in decimal form is : "+toDecimal(sc.next()));

        // Time Complexity : O(N)
        // Space Complexity : O(1)
    }
}
