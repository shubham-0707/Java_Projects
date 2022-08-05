/*
In this question we have to find the value x raised to the power of n


Example 1:

Input: x = 2.00000, n = 10

Output: 1024.00000

Explanation: You need to calculate 2.00000 raised to 10 which gives ans 1024.00000

Example 2:

Input: x = 2.10000, n = 3

Output: 9.26100

Explanation: You need to calculate 2.10000 raised to 3 which gives ans 9.26100

 */


package Striver_Sheet_Solutions_DayWise.Day_3;
import java.util.*;

public class power_x_n {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x : ");
        double x = sc.nextDouble();
        System.out.println("Enter n : ");
        int n = sc.nextInt();

        double pow = 1;
        for(int i=1 ; i<=n ; i++){
            pow = pow*x;
        }
        System.out.println("The value of the power is : "+pow);

        // Time Complexity : O(N)
        // Space Complexity : O(1)
    }
}
