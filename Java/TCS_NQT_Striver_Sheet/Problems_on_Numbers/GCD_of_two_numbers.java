/*
In this question we have to find the GCD of two numbers...
 */



package TCS_NQT_Striver_Sheet.Problems_on_Numbers;
import  java.util.*;

public class GCD_of_two_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a : ");
        int a = sc.nextInt();
        System.out.println("Enter b : ");
        int b = sc.nextInt();

        int mini = Math.min(a , b);
        int gcd = 1;

        for(int i=1 ; i<=mini ; i++){
            if(a%i==0 && b%i==0){
                gcd = i;
            }
        }

        System.out.println("The GCD of the given numbers is : "+gcd);

        // Time Complexity : O(N)
        // Space Complexity : O(1)
    }
}
