/*

...CONVERT BINARY TO OCTAL...

 */


package TCS_NQT_Striver_Sheet.Problems_on_Number_System;
import java.util.*;

public class convert_binary_to_octal {

    public static long toDecimal(String str){

        long sum = 0;
        int x= 0;
        for(int i=str.length()-1 ; i>=0 ; i--){
            if(str.charAt(i)=='1'){
                sum = sum + (long)Math.pow(2 , x);
            }
            x++;
        }
        return sum;
    }

    public static String toOctal(long n){
        String ans = "";
        if(n==0){
            return ans;
        }

        ans = ans+toOctal(n/8) + n%8;

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the binary number : ");
        String str = sc.next();

        long Decimal = toDecimal(str);

        String Octal = toOctal(Decimal);

        System.out.println("The number in octal form is : "+Octal);

        // Time Complexity : O(N)
        // Space Complexity : O(1)
    }
}
