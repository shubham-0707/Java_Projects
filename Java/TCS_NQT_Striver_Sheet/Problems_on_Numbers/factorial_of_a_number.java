
/*
In this question we have to calculate the factorial of a number :
 */

package TCS_NQT_Striver_Sheet.Problems_on_Numbers;
import java.util.*;

public class factorial_of_a_number {

    public static int fact(int n){
        if(n==0) return 1;
        return n*fact(n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();

        // To calculate the factorial we will use recursion

        System.out.println("The factorial of the number is : "+fact(n));

        // Time Complexity : O(n)
        // Space Complexity : O(1)

    }

}
