/*
In this question we have to check that a number is a niven number or not..
 */



package TCS_NQT_Striver_Sheet.Problems_on_Numbers;
import java.util.*;

public class Check_if_a_number_is_a_harshad_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();
        int temp = n;

        int sum = 0;
        while(n>0){
            sum = sum + n%10;
            n=n/10;
        }

        if(temp%sum==0){
            System.out.println("The number is a niven number");
            return;
        }

        System.out.println("The number is not a niven number");
    }
}
