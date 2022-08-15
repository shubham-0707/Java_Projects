/*

...Convert binary to decimal...

 */


package TCS_NQT_Striver_Sheet.Problems_on_Number_System;
import java.util.*;

public class convert_binary_to_decimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the binary number : ");
       String str = sc.next();
       long sum = 0;
       int x = 0;
       for(int i=str.length()-1 ; i>=0 ; i--){
           if(str.charAt(i)=='1'){
               sum = sum + (long)Math.pow(2 , x);
           }
           x++;
       }
        System.out.println("The answer is : "+sum);

       // Time Complexity : O(n) where n is the number of bits in the number
        // Space Complexity : O(1)
    }
}
