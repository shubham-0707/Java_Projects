/*

In this question we have to check that the number is even or odd...

 */
package TCS_NQT_Striver_Sheet.Problems_on_Numbers;
import java.util.*;

public class number_is_even_or_odd {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();

        //checking if a number is even or odd...

        if((n&1)==0){
            System.out.println("the number is even");
            return;
        }
        System.out.println("The number is odd");


        // Time Complexity : O(1)
        // Space Complexity : O(1)
    }
}
