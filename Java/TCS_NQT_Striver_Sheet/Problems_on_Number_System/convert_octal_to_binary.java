/*

...Convert octal to binary...

 */


package TCS_NQT_Striver_Sheet.Problems_on_Number_System;
import java.util.*;

public class convert_octal_to_binary {

    public static int toDecimal(String str){
        int sum = 0;
        int x = 0;

        for(int i=str.length()-1 ; i>=0 ; i--){
            sum = sum + Character.getNumericValue(str.charAt(i))*(int)Math.pow(8 , x);
            x++;
        }
        return sum;
    }

    public static String toBinary(int n){
        String ans = "";
        if(n==0){
            return ans;
        }
        ans = ans + toBinary(n/2) + n%2;
        return ans;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number in octal form : ");
        int decimal = toDecimal(sc.next());
        System.out.println("The number in binary is : "+toBinary(decimal));

        // Time Complexity : O(N)
        // Space Complexity : O(1)
    }
}
