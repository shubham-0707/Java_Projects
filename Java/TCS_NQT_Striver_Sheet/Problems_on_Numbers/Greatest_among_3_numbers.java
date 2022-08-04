/*

In this question we have to find the greatest number among 3 ...

 */


package TCS_NQT_Striver_Sheet.Problems_on_Numbers;
import java.util.*;

public class Greatest_among_3_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a : ");
        int a = sc.nextInt();
        System.out.println("Enter b : ");
        int b = sc.nextInt();
        System.out.println("Enter c : ");
        int c = sc.nextInt();

        int maxi = Math.max(a , Math.max(b , c));
        System.out.println("The number that is maximum is : "+maxi);

        // Time Complexity : O(1)
        // Space Complexity : o(1)

    }
}
