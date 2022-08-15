/*

...Convert decimal to octal...

 */



package TCS_NQT_Striver_Sheet.Problems_on_Number_System;
import java.util.*;

public class convert_decimal_to_octal {

    public static String toOctal(long n){
        String ans = "";
        if(n==0){
            return ans;
        }
        ans = ans + toOctal(n/8) + n%8;

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        long n = sc.nextInt();

        String  octal = toOctal(n);

        System.out.println("In octal is : "+octal);

        // Time Complexity : O(N)
        // Space Complexity : O(1)
    }
}
