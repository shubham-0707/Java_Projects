/*
In this program we have to find the area of circle..
 */

package TCS_NQT_Striver_Sheet.Problems_on_Numbers;
import java.util.*;

public class area_of_circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius : ");
        int r = sc.nextInt();

        float area = (float)3.14*r*r;
        System.out.println("Area of the circle is : "+area);

        // Time Complexity : O(1)
        // Space Complexity : O(1)
    }
}
