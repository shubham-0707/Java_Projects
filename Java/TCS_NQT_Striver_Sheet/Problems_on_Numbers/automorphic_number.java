
/*
In this question we have to check that the given number is auto-morphic or not..
 */


package TCS_NQT_Striver_Sheet.Problems_on_Numbers;
import java.util.*;

public class automorphic_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();

        int square = n*n;

        String str1 = Integer.toString(n);
        String str2 = Integer.toString(square).substring(Integer.toString(square).length()-str1.length());

        if(str1.equals(str2)){
            System.out.println("The two numbers are auto-morphic");
            return;
        }
        System.out.println("The numbers are not auto-morphic");

        // Time Complexity : O(N) due to use of substring function..
        // Space Complexity : O(1)
    }
}
