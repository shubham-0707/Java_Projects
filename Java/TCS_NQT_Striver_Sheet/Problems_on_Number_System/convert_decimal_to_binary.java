/*

...Convert decimal to binary...

 */


package TCS_NQT_Striver_Sheet.Problems_on_Number_System;
import java.util.*;

public class convert_decimal_to_binary {

    public static String toBinary(long n){
        String ans = "";
        if(n==0){
            return ans;
        }
        ans = ans + toBinary(n/2) + n%2;
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        long n = sc.nextInt();

        String binary = toBinary(n);
        System.out.println("The answer in binary is : " + binary);

        // Time Complexity : O(N)
        // Space Complexity : O(1)

    }
}
