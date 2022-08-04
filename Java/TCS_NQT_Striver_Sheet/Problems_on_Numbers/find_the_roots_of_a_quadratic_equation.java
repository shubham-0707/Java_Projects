/*
In this program we have to find the roots of a quadratic equation..
 */

package TCS_NQT_Striver_Sheet.Problems_on_Numbers;
import java.util.*;

public class find_the_roots_of_a_quadratic_equation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a : ");
        int a = sc.nextInt();
        System.out.println("Enter b : ");
        int b = sc.nextInt();
        System.out.println("Enter c : ");
        int c = sc.nextInt();

        int D = b*b-4*a*c;

        double root1 = (-1*b + Math.sqrt(D))/(2*a);
        double root2 = (-1*b - Math.sqrt(D))/(2*a);

        System.out.println("Root 1 : "+root1);
        System.out.println("Root 2 : "+root2);

        // Time Complexity : O(1)
        // Space Complexity : O(1)
    }
}
