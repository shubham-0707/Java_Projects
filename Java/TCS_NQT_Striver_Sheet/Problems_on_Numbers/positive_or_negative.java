/*

In this question we have to check that the number is positive or negative...

*/

package TCS_NQT_Striver_Sheet.Problems_on_Numbers;
import java.util.*;

public class positive_or_negative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n<0){
            System.out.println("The number is negative");
            return;
        }
        System.out.println("The number is positive");

        // Time Complexity : O(1)
        // Space Complexity : O(1)

    }
}
