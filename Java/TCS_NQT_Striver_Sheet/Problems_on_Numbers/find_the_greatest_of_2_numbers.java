/*

In this question we have to find the greatest of 2 numbers..

 */

package TCS_NQT_Striver_Sheet.Problems_on_Numbers;
import java.util.*;

public class find_the_greatest_of_2_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers : ");

        int a = sc.nextInt();
        int b = sc.nextInt();

        int greater = Math.max(a , b);
        System.out.println("The greater number of 2 numbers is : "+greater);
    }
}
