/*
In this question we have to find the LCM of two numbers...
 */


package TCS_NQT_Striver_Sheet.Problems_on_Numbers;
import java.util.*;

public class LCM_of_two_numbers {

    public static int findGCD(int a , int b){
        int mini = Math.min(a , b);
        int gcd = 1;

        for(int i=1 ; i<=mini ; i++){
            if(a%i==0 && b%i==0){
                gcd = i;
            }
        }
        return gcd;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a : ");
        int a = sc.nextInt();
        System.out.println("Enter b : ");
        int b = sc.nextInt();


        int gcd = findGCD(a , b);

        int lcm = (a*b)/gcd;
        System.out.println("The LCM of the two numbers is : "+lcm);

        // Time Complexity : O(N)
        // Space Complexity : O(1)
    }
}
